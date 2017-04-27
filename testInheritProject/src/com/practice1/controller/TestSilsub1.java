package com.practice1.controller;
import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		// => �ʱⰪ�� �ο��� �� ���� ��ü�� ������
		Book b1 = new Book("��⵵", "�ǿս�", 30000);
		Book b2 = new Book("�Ⱦ��","���ȱ�", 15000);

		// => �� ��ü�� ���� ��� ó���� : toString() ���
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		// => �� ��ü�� ���� ��ġ�ϴ��� ��� ��� : equals() ���
		System.out.println(b1.equals(b2));
		// => ù��° ��ü�� ������ ��ü ������ : clone() ���
		Book b3 = (Book)b1.clone();
		
		// => ù��° ��ü�� ���� ��ü�� �ּҰ� ������ ���
		System.out.println(b1.hashCode()==b3.hashCode());
		
		// => ù��° ��ü�� ���� ��ü�� ������ ������ ���
		System.out.println(b1.getAuthor()==b3.getAuthor());
		System.out.println(b1.getPrice()==b3.getPrice());
		System.out.println(b1.getTitle()==b3.getTitle());
		
	}

}
