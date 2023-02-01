/**
 * 
 */
package com.book;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class BookStore {
	
	
	Map<String, Book> titleMap;
	
	
	public BookStore(){
		titleMap = new HashMap<>();
	}

	public void addBook(Book b) {
		if(titleMap.containsValue(b)) {
			System.out.println("book exists");
		} else {
			titleMap.put(b.getTitle(), b);
			System.out.println("new book " + b.toString() + " added.");
		}
	}
	
	public void searchByTitle(String title) {
		if(titleMap.containsKey(title)) {
			Book b = titleMap.get(title);
			System.out.println(b.toString());
		}
		
	}
	
	public void searchByAuthor(String author) {
		for(String s : titleMap.keySet()) {
			Book b = titleMap.get(s);
			if(b.getAuthor().equals(author)) {
				System.out.println(titleMap.get(s).toString());
			}
		}
	}
	
	public void displayAll() {
		for(String s : titleMap.keySet()) {
			System.out.println(s + " " + titleMap.get(s).toString());
		}
	}
	
}
