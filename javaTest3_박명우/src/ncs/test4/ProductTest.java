package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Product pd;
		String name; 
		int price;
		int ea;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ǰ���� �Է��ϼ��� : ");
		name=sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		price=sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		ea=sc.nextInt();
		
		pd = new Product(name, price, ea);
		
		System.out.println("��ǰ�� : " + pd.getName());
		System.out.println("�� �� : " + pd.getPrice()+"��");
		System.out.println("�� �� : " + pd.getQuantity()+"��");
		System.out.println("�� ���� ���� : "+ pd.getPrice()*pd.getQuantity()+"��");
		
		
		
		
		
	}

}
