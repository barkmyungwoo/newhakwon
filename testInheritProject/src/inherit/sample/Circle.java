package inherit.sample;

public class Circle extends Shape{
	private double radius;
	
	public Circle(){
		super();								//생성자 안에서만 사용가능, 첫 줄에만 기입함. 기입 안해도 됨!!!!!!!! 컴파일 시 자동 생성.
		System.out.println("i'm circle");
	}
	
	public Circle(double r){
		System.out.println("i'm circle r : "+ r);
		
		this.radius = r;
	}
	
	public Circle(String name, double radius){
		super(name);			//부모의 생성자. super() == shape()
//		this.getName();			//private 에러
//		this.setName(name);		//값 변경이므로 부적합. 초기화가 아니다!!
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void information(){
		System.out.println("반지름  : "+ radius);
	}

	@Override
	public void calculator(){
		setArea(Math.PI*Math.pow(radius,2));
		setPerimeter(2*Math.PI*radius);
	}

	@Override
	public String toString() {
		return super.toString() + radius;
	}
	
	

	
}
