/**
 * 
 */
package Q3;

import java.util.Scanner;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Drive {
	
	public static void main(String[] args){
		
		//create variables 
		Scanner sc = new Scanner(System.in);
		int currentIndex = 0;
		Book[] arr;
		String choice;
		
		//ask for array size
		System.out.println("How many books to be stored?");
		int maxSize = Integer.parseInt(sc.nextLine());
		arr = new Book[maxSize];
		
		//menu
		do {
			System.out.println("1 - create book");
			System.out.println("2 - show all books");
			System.out.println("3 - exit");
			
			choice = sc.nextLine();
			switch(choice){
				case "1":
					createBooks(arr, currentIndex);
					currentIndex++;
					break;
				case "2":
					showBooks(arr, currentIndex);
					break;
				case "3":
					System.out.println("Application Terminated");
					break;
				default:
					System.out.println("Invalid input\n");
			}
		}while(!choice.equals("3"));
		
		
	}
	

	public static void showBooks(Book[] arr, int currentSize) {
		System.out.println(String.format("%-30s %s", "Book Title", "Price"));
		for(int i = 0; i < currentSize; i++) {
			System.out.println(arr[i].toString());
		}
	}
	
	public static void createBooks(Book[] arr, int currentIndex) {
		
		//out of bound exception handle
		if(currentIndex == arr.length) {
			System.out.println("Book storage exceed limit");
		} else {
			
			Scanner sc = new Scanner(System.in);
			
			//add new book item to array
			Book temp = new Book();
			System.out.println("Book name: ");
			temp.setBookTitle(sc.nextLine());
			System.out.println("Book price: ");
			temp.setBookPrice(Double.parseDouble(sc.nextLine()));
			arr[currentIndex] = temp;
		}
		
	}

}
