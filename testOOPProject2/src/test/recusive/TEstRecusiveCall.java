package test.recusive;

public class TEstRecusiveCall {

	public static void main(String[] args) {

		int result = new RecursiveCall().fectorial2(5);
	
		System.out.println();
		System.out.println(result);

	}
}

class RecursiveCall{
	public int fectorial(int value){
		if(value==1){
			System.out.print(value);
			return 1;
		}
		else {
			System.out.print(value+"*");
			return value*=fectorial(value-1);
		}
	}
	
	public int fectorial2(int value){
		int total=1;

		for (int i = 1; i <= value; i++) {
			total*=i;
		}
		return total;
	}
}