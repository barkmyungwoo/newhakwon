package test.staticfield2;

public class TestStaticField {
	//�ʵ� ���� 
	
	private static int num;
	private static double dnum;
	private static String name;
	
	//��� �ʵ� ����ƽ = ������ no making
	//setter getter �� static�̾�� �Ѵ�. 

	public static void setNum(int n) {
		num = n;
	}
	
	public static void main(String[] args) {
		System.out.println(num);
		setNum(7);
		System.out.println(num);
	}

}
