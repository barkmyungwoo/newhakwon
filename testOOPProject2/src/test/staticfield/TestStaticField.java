package test.staticfield;

public class TestStaticField {
	public static void main(String[] args) {
		System.out.println("count �� : " +StaticSample.count);
//		System.out.println("count �� : " +StaticSample.name);

		StaticSample samp = new StaticSample();
		System.out.println("count �� : " +StaticSample.count);
		System.out.println(samp.name);

		StaticSample samp2 = new StaticSample("�ڸ��",33);
		System.out.println("count �� : " +StaticSample.count);
		System.out.println(samp.name);
	
	}
}

class StaticSample {
	String name;
	int age;
	static int count;									//count�� ��ü �ȿ� ����!!!! static �ʵ忡 ������ �ȴ�!!!!!!!!!!
	
	public StaticSample(){
		count++;
	}

	public StaticSample(String name, int age){
		this.name = name;
		this.age = age;
		
		count++;
	}
}