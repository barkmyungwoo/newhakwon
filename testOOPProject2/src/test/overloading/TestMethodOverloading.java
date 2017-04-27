package test.overloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		MethodSample samp = new MethodSample();
		System.out.println("���� �� : " + samp.sum(10, 20));
		System.out.println("����,�Ǽ��� : " + samp.sum(10, 20.3));
		System.out.println("�Ǽ�,������ : " + samp.sum(54.3, 12));
		System.out.println("�Ǽ� �� : " + samp.sum(11.2, 22.3));
		System.out.println("�����迭 �� : " + samp.sum(new int[]{10,20,30}));
		System.out.println("�Ǽ��迭 �� : " + samp.sum(new double[]{11.2, 22.3, 44.5}));
		
	}

}

class MethodSample{
	public MethodSample(){}
	
	public int sum(int a, int b){
		return a + b;
	}
	
	public double sum(int a, double b){
		return a + b;
	}
	
	public double sum(double a, int b){
		return a + b;
	}
	
	public double sum(double a, double b){
		return a + b;
	}
	
	public int sum(int[] ar){
		int result = 0;
		for(int i = 0; i<ar.length;i++)
			result += 0;
		
		return result;
	}
	
	public double sum(double[] ar){
		double result = 0;
		for(int i = 0; i < ar.length; i++)
			result += ar[i];
		
		return result;
	}
	
}