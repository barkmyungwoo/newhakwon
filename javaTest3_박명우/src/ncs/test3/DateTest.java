package ncs.test3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar today = new GregorianCalendar();
		Calendar birth = new GregorianCalendar();
		String day = "";
		String day2 = "";
		birth.set(1985, 8, 23);
		
		switch(today.get(today.DAY_OF_WEEK)){
		case 1 : day = "�Ͽ���"; break;
		case 2 :day = "������"; break;
		case 3 :day = "ȭ����"; break;
		case 4 :day = "������"; break;
		case 5 :day = "�����"; break;
		case 6 :day = "�ݿ���"; break;
		case 7 :day = "�����"; break;
		}
		
		switch(birth.get(birth.DAY_OF_WEEK)){
		case 1 : day2 = "�Ͽ���"; break;
		case 2 :day2 = "������"; break;
		case 3 :day2 = "ȭ����"; break;
		case 4 :day2 = "������"; break;
		case 5 :day2 = "�����"; break;
		case 6 :day2 = "�ݿ���"; break;
		case 7 :day2 = "�����"; break;
		}
		
		System.out.println("���� : "+ birth.get(birth.YEAR)+"�� "+(birth.get(birth.MONTH)+1)+"�� "+birth.get(birth.DATE)+"�� "+ day2);
		System.out.println("���� : "+ today.get(today.YEAR)+"�� "+(today.get(today.MONTH)+1)+"�� "+today.get(today.DATE)+"�� "+day);
		System.out.println("���� : " +(today.get(today.YEAR)-birth.get(birth.YEAR)+1));
	}

}
