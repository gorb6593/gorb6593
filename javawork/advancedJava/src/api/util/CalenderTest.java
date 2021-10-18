package api.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜시간에 대한 작업
public class CalenderTest {
	public static void main(String[] args) {
		//현재 날짜와 시간 정보를 표현한 객체
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
	}
}
