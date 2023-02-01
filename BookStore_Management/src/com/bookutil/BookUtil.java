/**
 * 
 */
package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;
import com.book.InvalidBookException;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class BookUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BookStore bs = new BookStore();
		Scanner sc = new Scanner(System.in);
		
		
		//Hardcode testing
//		try {
//			bs.addBook(new Book("a1001", "Happy", "author1", "Fiction", (float) 20.5));
//			System.out.println("1 passed");
//		} catch (InvalidBookException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			bs.addBook(new Book("a1002", "Happy2", "author1", "Fiction", (float) 20.5));
//			System.out.println("1 passed");
//		} catch (InvalidBookException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			bs.addBook(new Book("a1003", "Happy3", "author1", "Fiction", (float) 20.5));
//			System.out.println("1 passed");
//		} catch (InvalidBookException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			bs.addBook(new Book("a1004", "Happy11", "author1", "Fiction", (float) 20.5));
//			System.out.println("1 passed");
//		} catch (InvalidBookException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		bs.displayAll();
//		
//		System.out.println("Enter title you want to search");
//		String titleToSearch = sc.next();
//		bs.searchByTitle(titleToSearch);
//		
//		System.out.println("Enter author you want to search");
//		String authorToSearch = sc.next();
//		bs.searchByAuthor(authorToSearch);
		
		
		// user input
		for(int i = 0; i < 3; i++) {
			System.out.println("New book " + i + " " + "ID: ");
			String id = sc.next();
			System.out.println("New book " + i + " " + "Title: ");
			String t = sc.next();
			System.out.println("New book " + i + " " + "author: ");
			String a = sc.next();
			System.out.println("New book " + i + " " + "Category: ");
			String c = sc.next();
			System.out.println("New book " + i + " " + "prirce: ");
			float p = sc.nextFloat();
			
			try {
				bs.addBook(new Book(id, t, a, c, p));
			} catch (InvalidBookException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Enter title you want to search");
		String titleToSearch = sc.next();
		bs.searchByTitle(titleToSearch);
		
		System.out.println("Enter author you want to search");
		String authorToSearch = sc.next();
		bs.searchByAuthor(authorToSearch);
		
		bs.displayAll();
		
		sc.close();
		
	}

}
