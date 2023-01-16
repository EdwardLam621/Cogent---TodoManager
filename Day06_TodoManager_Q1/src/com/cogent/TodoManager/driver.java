/**
 * 
 */
package com.cogent.TodoManager;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class driverQ1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// use command line argument to determine size of array
		int size = Integer.parseInt(args[0]);
		Task[] taskArr = new Task[size];
		Scanner sc = new Scanner(System.in);
		String choice;
		int currentTaskAmount = 0;
		
		do {
			System.out.println("******Menu******");
			System.out.println("Adding a new task");
			System.out.println("Updating a new task");
			System.out.println("Deleting a new task");
			System.out.println("Searching a new task");
			System.out.println("Please enter your choice:");
			
			choice = sc.nextLine();
			switch(choice) {
			case "1":
				currentTaskAmount = addTask(currentTaskAmount, size, taskArr);
				break;
			case "2":
				updateTask(taskArr);
				break;
			case "3":
				deleteTask(taskArr);
				break;
			case "4":
				searchTask(taskArr);
				break;
			
			}
			
		}while(Integer.parseInt(choice) != 0);
		
	}
	
	
	private static int addTask(int currentTaskAmount, int arrSize, Task[] taskArr) {
		Scanner sc = new Scanner(System.in);
		if(currentTaskAmount < arrSize) {
			Task t = new Task();
			System.out.println("Enter Task ID:");
			t.setTaskID(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Task Name:");
			t.setTaskName(sc.nextLine());
			taskArr[currentTaskAmount] = t;
			
			System.out.println("Task added");
			return currentTaskAmount += 1;
		} else {
			System.out.println("Storage size exceeded");
			return currentTaskAmount;
		}
	}
	
	/* Search and Update task by task ID*/
	private static void updateTask(Task[] taskArr) {
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the Task ID of the task to be updated?");
		int targetID = Integer.parseInt(sc.nextLine());
		for(Task x : taskArr) {
			if(x.getTaskID() == targetID) {
				found = true;
				System.out.println("Enter Task ID:");
				x.setTaskID(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter Task Name:");
				x.setTaskName(sc.nextLine());
				System.out.println("Task updated");
				break;
			}
		}
		if(!found) {
			System.out.println("Target task not found");
		}
		
	}
	
	/* Search and Delete task by task ID*/
	private static void deleteTask(Task[] taskArr) {
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the Task ID of the task to be updated?");
		int targetID = Integer.parseInt(sc.nextLine());
		for(Task x : taskArr) {
			if(x.getTaskID() == targetID) {
				x = new Task();
				System.out.println("Task deleted");
				break;
			}
		}
		if(!found) {
			System.out.println("Target task not found");
		}
	}
	
	/* Search and Display task by task ID*/
	private static void searchTask(Task[] taskArr) {
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the Task ID of the task to be searched?");
		int targetID = Integer.parseInt(sc.nextLine());
		for(Task x : taskArr) {
			if(x.getTaskID() == targetID) {
				found = true;
				System.out.println("Task ID: " + x.getTaskID());
				System.out.println("Task name: " + x.getTaskName());
				break;
			}
		}
		if(!found) {
			System.out.println("Target task not found");
		}
	}

}
