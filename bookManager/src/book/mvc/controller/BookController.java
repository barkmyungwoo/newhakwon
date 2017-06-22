package book.mvc.controller;

import java.util.*;

import book.mvc.model.dao.BookDao;
import book.mvc.model.vo.Book;
import book.mvc.view.BookMenu;

public class BookController {

	public void insertBook(Book b) {
		int result = new BookDao().insertBook(b);

		if (result > 0) {
			System.out.println("입력 성공");
			new BookMenu().displayMenu();
		} 
		else {
			new BookMenu().displayError("입력 실패");
		}
	}

	
	public void updateBook(Book b) {
		int result = new BookDao().updateBook(b);

		if (result > 0) {
			System.out.println("수정 성공");
			new BookMenu().displayMenu();
		} 
		else {
			new BookMenu().displayError("수정 실패");
		}
	}

	
	public void deleteBook(int bid) {
		int result = new BookDao().deleteBook(bid);

		if (result > 0) {
			System.out.println("삭제 성공");
			new BookMenu().displayMenu();
		} 
		else {
			new BookMenu().displayError("삭제 실패");
		}
	}

	
	public void searchBook(int bid) {
		new BookMenu().displayBook(new BookDao().selectBook(bid));
	}

	
	public void searchBookTitle(String title) {
		new BookMenu().displayBook( new BookDao().searchBookTitle(title));		
	}

	
	public void selectAll() {
		new BookMenu().displayBooks(new BookDao().selectAllBooks());
	}

}
