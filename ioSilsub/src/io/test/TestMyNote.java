package io.test;

import java.util.Scanner;

import io.silsub1.MyNote;

public class TestMyNote {

	public void menu() {
		MyNote my = new MyNote();
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("메뉴 선택 :");
			num = sc.nextInt();

			switch (num) {
			case 1:
				my.fileSave();
				break;
			case 2:
				my.fileOpen();
				break;
			case 3:
				my.fileEdit();
				break;
			case 4:
				return;
			}
		} while (true);

	}

	public static void main(String[] args) {
		new TestMyNote().menu();

	}

}
