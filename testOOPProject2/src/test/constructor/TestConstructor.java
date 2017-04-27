package test.constructor;

public class TestConstructor {

	public static void main(String[] args) {
		ConstructorSample samp = new ConstructorSample();
		samp.displayValue();
	}

}

class ConstructorSample{
	private int intValue;
	private double dblValue;
	
	//하나라도 매개변수가 있는 생성자가 있으면 자동추가가 안된다.
	public ConstructorSample(){
		this(10, 20.3); //반드시 this 생성자는 첫줄에다가 써야한다.
		//ConstructorSample(10, 20.3); //생성자 안에서 생성자를 호출할때는 this를 사용한다. 
	} 
	
	
	public ConstructorSample(int intValue, double dblValue){
		this.intValue=intValue;
		this.dblValue=dblValue;
		//this(); 첫줄이 아닌 세번째 줄에 써서 문제가 생긴다.
	}
	
	public void displayValue(){
		//this(); 일반 메소드 안에서 사용하면 오류가 뜬다.
		System.out.println("intValue : " + this.intValue);
		System.out.println("dblValue : " + this.dblValue);
		
	}
}