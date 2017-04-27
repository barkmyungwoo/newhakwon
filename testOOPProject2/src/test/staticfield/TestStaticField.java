package test.staticfield;

public class TestStaticField {
	public static void main(String[] args) {
		System.out.println("count 값 : " +StaticSample.count);
//		System.out.println("count 값 : " +StaticSample.name);

		StaticSample samp = new StaticSample();
		System.out.println("count 값 : " +StaticSample.count);
		System.out.println(samp.name);

		StaticSample samp2 = new StaticSample("박명우",33);
		System.out.println("count 값 : " +StaticSample.count);
		System.out.println(samp.name);
	
	}
}

class StaticSample {
	String name;
	int age;
	static int count;									//count는 객체 안에 없다!!!! static 필드에 선언이 된다!!!!!!!!!!
	
	public StaticSample(){
		count++;
	}

	public StaticSample(String name, int age){
		this.name = name;
		this.age = age;
		
		count++;
	}
}