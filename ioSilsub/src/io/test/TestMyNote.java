package io.test;

import java.util.Scanner;

import io.silsub1.MyNote;

public class TestMyNote {

	public void menu() {
		MyNote my = new MyNote();
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�޴� ���� :");
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
