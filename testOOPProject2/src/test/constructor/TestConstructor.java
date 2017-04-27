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
	
	//�ϳ��� �Ű������� �ִ� �����ڰ� ������ �ڵ��߰��� �ȵȴ�.
	public ConstructorSample(){
		this(10, 20.3); //�ݵ�� this �����ڴ� ù�ٿ��ٰ� ����Ѵ�.
		//ConstructorSample(10, 20.3); //������ �ȿ��� �����ڸ� ȣ���Ҷ��� this�� ����Ѵ�. 
	} 
	
	
	public ConstructorSample(int intValue, double dblValue){
		this.intValue=intValue;
		this.dblValue=dblValue;
		//this(); ù���� �ƴ� ����° �ٿ� �Ἥ ������ �����.
	}
	
	public void displayValue(){
		//this(); �Ϲ� �޼ҵ� �ȿ��� ����ϸ� ������ ���.
		System.out.println("intValue : " + this.intValue);
		System.out.println("dblValue : " + this.dblValue);
		
	}
}