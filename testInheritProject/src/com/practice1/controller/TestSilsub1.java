package com.practice1.controller;
import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		// => 초기값을 부여한 두 개의 객체를 생성함
		Book b1 = new Book("경기도", "의왕시", 30000);
		Book b2 = new Book("안양시","동안구", 15000);

		// => 두 객체의 정보 출력 처리함 : toString() 사용
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		// => 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
		System.out.println(b1.equals(b2));
		// => 첫번째 객체를 복제한 객체 생성함 : clone() 사용
		Book b3 = (Book)b1.clone();
		
		// => 첫번째 객체와 복제 객체의 주소가 같은지 출력
		System.out.println(b1.hashCode()==b3.hashCode());
		
		// => 첫번째 객체와 복제 객체의 내용이 같은지 출력
		System.out.println(b1.getAuthor()==b3.getAuthor());
		System.out.println(b1.getPrice()==b3.getPrice());
		System.out.println(b1.getTitle()==b3.getTitle());
		
	}

}
