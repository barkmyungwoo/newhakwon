package inherit.sample;

public class Circle extends Shape{
	private double radius;
	
	public Circle(){
		super();								//������ �ȿ����� ��밡��, ù �ٿ��� ������. ���� ���ص� ��!!!!!!!! ������ �� �ڵ� ����.
		System.out.println("i'm circle");
	}
	
	public Circle(double r){
		System.out.println("i'm circle r : "+ r);
		
		this.radius = r;
	}
	
	public Circle(String name, double radius){
		super(name);			//�θ��� ������. super() == shape()
//		this.getName();			//private ����
//		this.setName(name);		//�� �����̹Ƿ� ������. �ʱ�ȭ�� �ƴϴ�!!
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
		System.out.println("������  : "+ radius);
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
