package oop.staticmethod;

public class StaticMethod {
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticMethod.value = value;
	}

	public static void toUpper(){
		value =value.toUpperCase();
	}
	
	public static void setChar(int index, char c){
		char[] c1 = value.toCharArray();
		c1[index]=c;
		value = String.valueOf(c1);
	}
	
	public static int valueLength(){
		return value.length();
	}
	
	public static String valueConcat(String str){
		return value.concat(str);
	}
	
	public static void main(String[] args) {
		setValue("barkmyungwoo");
		System.out.println(getValue());

		toUpper();
		System.out.println(getValue());
		setChar(7, 'k');
		System.out.println(getValue());
		
		System.out.println(valueLength());
		
		System.out.println(valueConcat(" is perfect"));
	}
}
