package inherit.test;

import inherit.sample.*;

public class TestInheritance {
	// 상속간의 생성자 구동 확인 테스트

	public void test1() {
		Circle cir = new Circle();
		Rectangle re = new Rectangle();
		Circle cir2 = new Circle(12.5);
		Rectangle re2 = new Rectangle(10, 12);

		Rectangle re3 = new Rectangle("hahaha", 12, 8);

		cir.calculator();
		cir2.calculator();
		re.calculator();
		re2.calculator();
		re3.calculator();

		cir.information();
		cir2.information();
		re.information();
		re2.information();
		re3.information();
	}

	public void test2() {
		Circle[] crr = new Circle[3];
		Rectangle[] rrr = new Rectangle[3];

		// 객체할당

		crr[0] = new Circle();
		crr[1] = new Circle(12.2);
		crr[2] = new Circle("haha ", 13);

		rrr[0] = new Rectangle();
		rrr[1] = new Rectangle(12, 8);
		rrr[2] = new Rectangle("hahaha ", 16, 21);

		// 계산
		for (int i = 0; i < 3; i++) {
			crr[i].calculator();
			rrr[i].calculator();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println();
			crr[i].information();
			System.out.println();
			rrr[i].information();

		}

	}

	public void test3(){
		Shape s = new Shape("도형");
		Shape s2 = s;
		
		System.out.println(s.equals(s2));
	}
	
	public void test4(){
		Shape s = new Shape("도형");
		Circle c = new Circle("원", 15);
		Rectangle r = new Rectangle("사각형", 9, 5);
		
		System.out.println(s);
		System.out.println(c);
		System.out.println(r);
		
	}

	public static void main(String[] args) {
		TestInheritance in = new TestInheritance();
		in.test4();
	}
}
