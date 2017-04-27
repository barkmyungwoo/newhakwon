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
	
	@Override							//�θ� ������ �޼ҵ� ǥ��. �׷��� ������ �ļղ���. 
	public void information(){
		super.information();
		
		System.out.println("���� : "+ width);
		System.out.println("���� : "+ height);
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
