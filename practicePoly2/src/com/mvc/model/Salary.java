package com.mvc.model;

public class Salary {

	String name; // �̸�
	long pay; // �⺻��
	long familyP; // ��������
	long overtimeP; // �ð��ܼ���
	long incenP; // ������
	long tax; // ����
	long totalPay; // �Ǽ��ɾ�
	int family; // ������
	int overtime; // �ʰ��ٹ��ð�
	static float incentive = 0.5f;// �μ�Ƽ�� - �ʱⰪ(0.5)
	static int count; // ���ο� - �ʱⰪ(0)
	
	Salary(String name, long pay, int family, int overtime){
		this.name = name;
		this.pay = pay;
		this.family = family;
		this.overtime = overtime;		
		count ++;
	}
	
	public Salary() {
		count ++;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}

	public void setPay(long pay) {
		this.pay = pay;
	}

	public long getFamilyP() {
		return familyP;
	}

	public void setFamilyP(long familyP) {
		this.familyP = familyP;
	}

	public long getOvertimeP() {
		return overtimeP;
	}

	public void setOvertimeP(long overtimeP) {
		this.overtimeP = overtimeP;
	}

	public long getIncenP() {
		return incenP;
	}

	public void setIncenP(long incenP) {
		this.incenP = incenP;
	}

	public long getTax() {
		return tax;
	}

	public void setTax(long tax) {
		this.tax = tax;
	}

	public long getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(long totalPay) {
		this.totalPay = totalPay;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public static float getIncentive() {
		return incentive;
	}

	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Salary.count = count;
	}	
}
