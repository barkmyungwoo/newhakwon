package test.staticMethod;

public class TestStaticMethod {
	public static void main(String[] args) {
		StaticMethodSample s = new StaticMethodSample();

		
		int x = StaticMethodSample.add(3, 4);
	}
}

class StaticMethodSample{
	private int a, b;										//�������� heap 
	
	public StaticMethodSample(){}
	
	public int add(){
		return a + b;
	}
	
	public static int add(int a, int b){					//int a, b �� ���ÿ� �Ҵ� ���� ������ ������ ����
		return a + b;
	}
}