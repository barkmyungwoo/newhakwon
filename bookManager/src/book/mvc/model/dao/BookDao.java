package book.mvc.model.dao;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import book.mvc.model.vo.Book;

import static common.Connect.*;

public class BookDao {
	private Properties prop = new Properties();

	public BookDao() {
		try {
			prop.load(new FileReader("sql.properties"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public int insertBook(Book b) {
		int result = 0;

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		System.out.println(prop.getProperty("insert"));

		try {

			pstmt = conn.prepareStatement(prop.getProperty("insert"));
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());
			result = pstmt.executeUpdate();

			if (result > 0)
				commit(conn);
			else
				rollback(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}// 새로운 레코드 정보를 전달받아 쿼리문에 적용, 테이블에 추가함

	public int updateBook(Book b) {
		int result = 0;

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		System.out.println(prop.getProperty("update"));

		try {

			pstmt = conn.prepareStatement(prop.getProperty("update"));
			pstmt.setString(1, b.getTitle());
			pstmt.setString(2, b.getAuthor());
			pstmt.setString(3, b.getPublisher());
			pstmt.setInt(4, b.getPrice());
			pstmt.setInt(5, b.getBook_id());
			result = pstmt.executeUpdate();

			if (result > 0)
				commit(conn);
			else
				rollback(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

		return result;
	}// 수정할 정보를 전달받아 테이블의 내용 변경함

	public int deleteBook(int bid) {
		int result = 0;

		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		System.out.println(prop.getProperty("delete"));

		try {
			pstmt = conn.prepareStatement(prop.getProperty("delete"));
			pstmt.setInt(1, bid);
			result = pstmt.executeUpdate();

			if (result > 0)
				commit(conn);
			else
				rollback(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return result;
	}// 삭제할 책아이디을 전달받아 테이블의 정보 삭제함

	public ArrayList<Book> selectAllBooks() {
		ArrayList<Book> arr = null;
		Book b = null;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet set = null;

		try {
			pstmt = conn.prepareStatement(prop.getProperty("all"));
			set = pstmt.executeQuery();

			if (set != null) {
				arr = new ArrayList<Book>();

				while (set.next()) {
					b = new Book();
					b.setBook_id(set.getInt("BOOK_ID"));
					b.setTitle(set.getString("TITLE"));
					b.setAuthor(set.getString("AUTHOR"));
					b.setPublisher(set.getString("PUBLISHER"));
					b.setPublish_date(set.getDate("PUBLISH_DATE"));
					b.setPrice(set.getInt("PRICE"));
					arr.add(b);
					
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(set);
			close(pstmt);
			close(conn);
		}

		return arr;
	}// 테이블의 모든 정보를 조회해서 리스트에 담아 리턴함

	public Book searchBookTitle(String title) {
		Book b = null;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet set = null;
		System.out.println(prop.getProperty("titleSearch"));

		try {
			pstmt = conn.prepareStatement(prop.getProperty("titleSearch"));
			pstmt.setString(1, title.trim());
			set = pstmt.executeQuery();

			if (set.next()) {
				b = new Book();

				b.setBook_id(set.getInt("BOOK_ID"));
				b.setTitle(set.getString("TITLE"));
				b.setAuthor(set.getString("AUTHOR"));
				b.setPublisher(set.getString("PUBLISHER"));
				b.setPublish_date(set.getDate("PUBLISH_DATE"));
				b.setPrice(set.getInt("PRICE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(set);
			close(pstmt);
			close(conn);
		}

		return b;
	}// 책제목을 넘겨받아, 해당 도서조회해서 리스트에 담아 리턴

	public Book selectBook(int id) {
		Book b = null;

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet set = null;
		System.out.println(prop.getProperty("idSearch"));

		try {
			pstmt = conn.prepareStatement(prop.getProperty("idSearch"));
			pstmt.setInt(1, id);
			
			
			set = pstmt.executeQuery();

			if (set.next()) {
				b = new Book();

				b.setBook_id(set.getInt("BOOK_ID"));
				b.setTitle(set.getString("TITLE"));
				b.setAuthor(set.getString("AUTHOR"));
				b.setPublisher(set.getString("PUBLISHER"));
				b.setPublish_date(set.getDate("PUBLISH_DATE"));
				b.setPrice(set.getInt("PRICE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(set);
			close(pstmt);
			close(conn);
		}

		
		return b;
	}// 책 아이디를 전달받아 해당 도서 조회해서 객체에 담아 리턴
}
