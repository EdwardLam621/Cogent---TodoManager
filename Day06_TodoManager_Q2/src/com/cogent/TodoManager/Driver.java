/**
 * 
 */
package com.cogent.TodoManager;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-17
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		Task t1,t2,t3;
		t1 = createTask();
		t2 = createTask();
		t3 = createTask();
		
		String choice = "";
		do {
			System.out.println("Choose print Task in ascending or descending");
			System.out.println("1 - ascending name order");
			System.out.println("2 - descending name order");
			System.out.println("3 - Exit");
			choice = sc.nextLine();
			System.out.println("Username: " + name);
			
			switch(choice) {
			case "1":
				printIncreasingTaskOrder(t1,t2,t3, true);
				break;
			case "2":
				printIncreasingTaskOrder(t1,t2,t3, false);
				break;
			}
		} while(Integer.parseInt(choice) != 3);
		
		
		
	}
	
	private static Task createTask() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Task ID: ");
		String taskID = sc.nextLine();
		System.out.println("Please enter Task Name: ");
		String taskName = sc.nextLine();
		Task t = new Task();
		t.setTaskID(Integer.parseInt(taskID));
		t.setTaskName(taskName);
		return t;
	}
	
	private static void printIncreasingTaskOrder(Task t1, Task t2, Task t3, boolean descending) { 
		Task temp, a, b, c;
		a = t1;
		b = t2;
		c = t3;
		
		if(a.getTaskName().compareTo(a.getTaskName())< 0) {
			temp = a;
			a = b;
			b = temp;
		} else if (c.getTaskName().compareTo(b.getTaskName()) < 0) {
			temp = b;
			b = c;
			c = temp;
		} else if (b.getTaskName().compareTo(a.getTaskName()) < 0) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(descending) {
			System.out.println(a.getTaskID() + " " + a.getTaskName());
			System.out.println(b.getTaskID() + " " + b.getTaskName());
			System.out.println(c.getTaskID() + " " + c.getTaskName());
		} else {
			System.out.println(c.getTaskID() + " " + c.getTaskName());
			System.out.println(b.getTaskID() + " " + b.getTaskName());
			System.out.println(a.getTaskID() + " " + a.getTaskName());
		}
		
	}

}
