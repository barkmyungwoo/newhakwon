package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		double sum =0;
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 :");
		num=sc.nextInt();
		try {
			sum = new Calculator().getSum(num);
			
			System.out.println("결과값 : "+(int)sum);
		} 
		catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
