package com.practice1.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	
	@Override	
	public Object clone(){
		Book bc = new Book();
			bc.setTitle(this.getTitle());
			bc.setAuthor(this.getAuthor());
			bc.setPrice(this.getPrice());
		return bc;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

}
