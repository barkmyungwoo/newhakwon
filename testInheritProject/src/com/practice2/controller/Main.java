package com.practice2.controller;

import com.practice2.model.entity.*;


public class Main {

	public static void main(String[] args) {

		// Circle �迭 �ʱ�ȭ : 3��
		// Rectangle �迭 �ʱ�ȭ : 3��
		// ���� draw() ��� ó��
		
		
		Circle[] crr = new Circle[3];
		Rectangle[] rrr = new Rectangle[3];

		// ��ü�Ҵ�

		crr[0] = new Circle(3, 5, 10);
		crr[1] = new Circle(4, 3, 7);
		crr[2] = new Circle(5, 8, 13);

		rrr[0] = new Rectangle(4, 6, 26,44);
		rrr[1] = new Rectangle(12, 8, 4, 7);
		rrr[2] = new Rectangle(22, 14, 16, 21);

		for (int i = 0; i < 3; i++) {
			System.out.println();
			crr[i].draw();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println();
			rrr[i].draw();
		}

	}

}
