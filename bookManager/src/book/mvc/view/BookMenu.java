package book.mvc.view;

import java.util.*;

import book.mvc.controller.BookController;
import book.mvc.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);

	public BookMenu() {}

	public void displayMenu() {
		int no;
		Book b =null;
		BookController con = new BookController();

		do {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 정보 수정");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 아이디로 조회");
			System.out.println("5. 도서 제목으로 조회");
			System.out.println("6. 도서 목록 전체 조회");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			no = sc.nextInt();

			switch (no) {
			case 1:
				con.insertBook(inputBook());
				break;

			case 2:
				con.updateBook(inputBook(b));
				break;

			case 3:
				con.deleteBook(inputBookId());
				break;

			case 4:
				con.searchBook(inputBookId());
				break;

			case 5:
				con.searchBookTitle(inputBookTitle());
				break;

			case 6:
				con.selectAll();
				break;

			case 9:
				return;

			default:
				System.out.println("번호 실수 하지마라.");
			}
		} while (true);
	}

	public Book inputBook() {
		Book b = new Book();
		
		System.out.print("책 제목 입력 : ");
		b.setTitle(sc.nextLine()+sc.nextLine());
		System.out.print("저자 입력 : ");
		b.setAuthor(sc.nextLine());
		System.out.print("출판사 입력 : ");
		b.setPublisher(sc.nextLine());
		System.out.print("가격 입력 : ");
		b.setPrice(sc.nextInt());
		
		return b;
	} // => 새 도서정보 키보드 입력용

	public Book inputBook(Book b) {
		b=new Book();
		System.out.print("책 ID 입력 : ");
		b.setBook_id(sc.nextInt());;
		System.out.print("책 제목 입력 : ");
		b.setTitle(sc.next()+sc.nextLine());
		System.out.print("저자 입력 : ");
		b.setAuthor(sc.nextLine());
		System.out.print("출판사 입력 : ");
		b.setPublisher(sc.nextLine());
		System.out.print("가격 입력 : ");
		b.setPrice(sc.nextInt());

		return b;
	}

	public int inputBookId() {
		System.out.print("도서의 ID 를 입력하세요 : ");
		return sc.nextInt();
	} // => 검색/삭제할 도서 아이디 입력용

	public String inputBookTitle() {
		System.out.print("도서의 제목을 입력하세요 : ");
		return sc.nextLine() + sc.nextLine();
	} // => 도서제목 키보드 입력용

	public void displayBooks(ArrayList<Book> list) {
		for (Book book : list) {
			System.out.println(book);
		}
	} // => 도서목록 출력용

	public void displayBook(Book b) {
		System.out.println(b);
	} // => 도서 출력용

	public void displayError(String message) {
		System.out.println(message);
		System.out.println("뭔가 틀렸으니 내가 실행 된거다. 난이미 틀렸다. ");
	} // => 에러메세지 출력용

}
