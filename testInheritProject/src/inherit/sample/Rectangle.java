package inherit.sample;

public class Rectangle extends Shape{
	private double width, height;
	
	public Rectangle(){
		System.out.println("i'm ractangle");
	}
	
	public Rectangle(double w, double h){
		System.out.println("i'm ractangle w : "+ w);
		System.out.println("i'm ractangle h : "+ h);
		this.width = w;
		this.height = h;
		
	}
	

	public Rectangle(String name,double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
		System.out.println("i'm operating. name widht, height");
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	
	
	@Override							//부모 소유의 메소드 표기. 그러나 실행은 후손꺼다. 
	public void information(){
		super.information();
		
		System.out.println("가로 : "+ width);
		System.out.println("세로 : "+ height);
	}

	@Override
	public void calculator(){
		setArea(width*height);
		setPerimeter(2*(width+height));
	}

	@Override
	public String toString() {
		return super.toString()+"width=" + width + ", height=" + height;
	}
	
	

}
