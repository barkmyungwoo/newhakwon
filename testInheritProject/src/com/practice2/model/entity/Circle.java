package com.practice2.model.entity;

public class Circle extends Point{
	private int radius;

	public Circle() {
	}

	public Circle(int radius, int x, int y) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw(){
		System.out.println("X :"+super.getX());
		System.out.println("Y :"+super.getY());
		System.out.printf("면적 : "+ (double)(Math.round((int)((Math.PI*this.radius*this.radius))*10))/10);
		System.out.printf("둘레 : "+ (double)(Math.round((int)(2*Math.PI*this.radius)*10))/10);
	} 
	
	

}
