package com.Javatraining.Library;

public class BookApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EBook javaBook = new EBook("JavaBook",101,"Ramesh",10,200 );
		LibraryManager.showBorrowingTime(javaBook);
		System.out.println(javaBook.toString());
		
		Journals DotNetBook = new Journals("DotNetBook", 201, "Maruth", "TMH", "TechCoding");
		LibraryManager.showBorrowingTime(DotNetBook);
		System.out.println(DotNetBook.toString());
		
		
		

	}

}