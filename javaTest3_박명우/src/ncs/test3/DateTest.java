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
		case 1 : day = "일요일"; break;
		case 2 :day = "월요일"; break;
		case 3 :day = "화요일"; break;
		case 4 :day = "수요일"; break;
		case 5 :day = "목요일"; break;
		case 6 :day = "금요일"; break;
		case 7 :day = "토요일"; break;
		}
		
		switch(birth.get(birth.DAY_OF_WEEK)){
		case 1 : day2 = "일요일"; break;
		case 2 :day2 = "월요일"; break;
		case 3 :day2 = "화요일"; break;
		case 4 :day2 = "수요일"; break;
		case 5 :day2 = "목요일"; break;
		case 6 :day2 = "금요일"; break;
		case 7 :day2 = "토요일"; break;
		}
		
		System.out.println("생일 : "+ birth.get(birth.YEAR)+"년 "+(birth.get(birth.MONTH)+1)+"월 "+birth.get(birth.DATE)+"일 "+ day2);
		System.out.println("현재 : "+ today.get(today.YEAR)+"년 "+(today.get(today.MONTH)+1)+"월 "+today.get(today.DATE)+"일 "+day);
		System.out.println("나이 : " +(today.get(today.YEAR)-birth.get(birth.YEAR)+1));
	}

}
