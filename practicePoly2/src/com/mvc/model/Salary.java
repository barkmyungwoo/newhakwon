package com.mvc.model;

public class Salary {

	String name; // 이름
	long pay; // 기본급
	long familyP; // 가족수당
	long overtimeP; // 시간외수당
	long incenP; // 성과금
	long tax; // 세금
	long totalPay; // 실수령액
	int family; // 가족수
	int overtime; // 초과근무시간
	static float incentive = 0.5f;// 인센티브 - 초기값(0.5)
	static int count; // 총인원 - 초기값(0)
	
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
