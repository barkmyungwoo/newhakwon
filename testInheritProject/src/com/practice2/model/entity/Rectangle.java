package com.practice2.model.entity;

public class Rectangle extends Point{
	private int weight;
	private int height;

	public Rectangle() {
	}


	public Rectangle(int weight, int height, int x, int y) {
		super(x, y);
		this.weight = weight;
		this.height = height;
	}



	@Override
	public void draw(){
		System.out.println("X :"+super.getX());
		System.out.println("Y :"+super.getY());
		System.out.println("면적 : "+ (weight*height));
		System.out.println("둘레 : "+ (2*(weight+height)));
	} 
	
	

}
