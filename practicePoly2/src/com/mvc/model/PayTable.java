package com.mvc.model;

import com.mvc.view.*;

public class PayTable extends Salary implements Calculate, Output{
	
	public PayTable(){
		
	}
	
	public PayTable(String name, long pay, int family,	int overtime) {
		super(name, pay, family, overtime);
	}

	@Override
	public void out() {
		calc();		
		System.out.print(super.getName()+"	 ");
		System.out.print(super.getPay()+"		");
		System.out.print(super.getFamily()+"	");
		System.out.print(super.getFamilyP()+"		");
		System.out.print(super.getOvertime()+"	");
		System.out.print(super.getOvertimeP()+"	");
		System.out.print(super.getTax()+"	");
		System.out.print(super.incentive+"	  ");
		System.out.print(super.getIncenP()+"   ");
		System.out.println(super.getTotalPay());
		
	}

	@Override
	public void calc() {
		int tmp;

		if(super.getFamily()<3)
			tmp =super.getFamily()*20000;
		else
			tmp = 60000;

		super.setFamilyP(tmp);
		super.setOvertimeP(super.getOvertime()*5000);
		super.setTax((long)(super.getPay()*0.1));
		super.setIncenP((long)(super.incentive*super.getPay()));
		super.setTotalPay(super.getPay()+super.getFamilyP()+super.getIncenP()+super.getOvertimeP()-super.getTax());
		
	}
	

}
