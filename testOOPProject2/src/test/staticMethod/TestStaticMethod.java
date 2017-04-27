package test.staticMethod;

public class TestStaticMethod {
	public static void main(String[] args) {
		StaticMethodSample s = new StaticMethodSample();

		
		int x = StaticMethodSample.add(3, 4);
	}
}

class StaticMethodSample{
	private int a, b;										//전역변수 heap 
	
	public StaticMethodSample(){}
	
	public int add(){
		return a + b;
	}
	
	public static int add(int a, int b){					//int a, b 는 스택에 할당 지역 변수는 무조건 스택
		return a + b;
	}
}