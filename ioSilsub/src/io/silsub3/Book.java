package io.silsub3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Book {

	String title; // 도서명
	String author; // 저자
	int price; // 가격
	Calendar dates = new GregorianCalendar(); // 출판날짜
	double discountRate; // 할인율
	
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
	}

	public Book() {}

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

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return  title + ", author=" + author + ", price=" + price + ", dates=" + dates
				+ ", discountRate=" + discountRate;		
	}
	
	

}
