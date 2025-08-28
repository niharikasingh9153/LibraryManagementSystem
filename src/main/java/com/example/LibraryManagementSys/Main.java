package com.example.LibraryManagementSys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Library library = context.getBean("library", Library.class);

		System.out.println("Library: " + library.getName());
		System.out.println("Member: " + library.getMember());
		System.out.println("Books:");

		for (Book book : library.getBooks()) {
			System.out.println(book);
		}
	}
}
