package test.staticfield2;

public class TestStaticField {
	//필드 선언 
	
	private static int num;
	private static double dnum;
	private static String name;
	
	//모든 필드 스테틱 = 생성자 no making
	//setter getter 도 static이어야 한다. 

	public static void setNum(int n) {
		num = n;
	}
	
	public static void main(String[] args) {
		System.out.println(num);
		setNum(7);
		System.out.println(num);
	}

}
