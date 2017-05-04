package ncs.test4;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Product pd;
		String name; 
		int price;
		int ea;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명을 입력하세요 : ");
		name=sc.next();
		System.out.print("가격을 입력하세요 : ");
		price=sc.nextInt();
		System.out.print("수량을 입력하세요 : ");
		ea=sc.nextInt();
		
		pd = new Product(name, price, ea);
		
		System.out.println("상품명 : " + pd.getName());
		System.out.println("가 격 : " + pd.getPrice()+"원");
		System.out.println("수 량 : " + pd.getQuantity()+"개");
		System.out.println("총 구매 가격 : "+ pd.getPrice()*pd.getQuantity()+"원");
		
		
		
		
		
	}

}
