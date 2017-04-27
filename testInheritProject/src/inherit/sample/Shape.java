package inherit.sample;

public class Shape {
	private String name;			//이름
	private double area;			//면적
	private double perimeter;		//둘레
	
	public Shape(){
		System.out.println("i'm your father");
	}
	
	public Shape(String name){
		System.out.println("i'm your father" + name );
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void calculator(){
		
	}

	public void information() {
		System.out.println("name : " + name + "\narea : " + area + "\nperimeter : " + perimeter);	
	}

	@Override
	public String toString() {
		return "name : " + name + ", area : " + area + ", perimete : " + perimeter;
	}
	
	
}