package com.mvc.controller;

import com.mvc.model.PayTable;
import com.mvc.model.Salary;

public class PayTableTest {

	public static void main(String[] args) {
		Salary[] pt = new Salary[3];
		pt[0] = new PayTable("�Ҽ���", 750000, 2, 3);
		pt[1] = new PayTable("���ָ�", 800000, 1, 4);
		pt[2] = new PayTable("���ȸ�", 650000, 6, 2);

		System.out.println("					**** �޿����� ****");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("�̸�      �⺻��    ������   ��������   �ð��ܱٹ�  �ð��ܼ��� ����  �μ�Ƽ��(%)  ������   �Ǽ��ɾ�");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		for (int i = 0; i < pt.length; i++) {
			((PayTable) pt[i]).out();
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		System.out.println("�� �ο� : " + Salary.getCount());

		
		Salary.setIncentive(0.7f);
		System.out.println();
		System.out.println();
		
		System.out.println("					**** �޿����� ****");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println("�̸�      �⺻��    ������   ��������   �ð��ܱٹ�  �ð��ܼ��� ����  �μ�Ƽ��(%)  ������   �Ǽ��ɾ�");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		for (int i = 0; i < pt.length; i++) {
			((PayTable) pt[i]).out();
		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		System.out.println("�� �ο� : " + Salary.getCount());
	}

}
