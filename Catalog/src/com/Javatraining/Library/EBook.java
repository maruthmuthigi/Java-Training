package com.Javatraining.Library;

public class EBook extends LibraryItem {
	
	private int numberOfTracks;
	private double duration;
	public EBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EBook(String itemName, long itemCode, String author) {
		super(itemName, itemCode, author);
		// TODO Auto-generated constructor stub
	}
	public EBook(String itemName, long itemCode, String author, int numberOfTracks, double duration) {
		super(itemName, itemCode, author);
		this.numberOfTracks = numberOfTracks;
		this.duration = duration;
	}
	@Override
	public String borrowingTime() {
		// TODO Auto-generated method stub
		//return super.borrowingTime();
		return "2 weeks";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
