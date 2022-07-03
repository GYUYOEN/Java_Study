package exam11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Sample06 {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1996, 10, 21);
		LocalDate today = LocalDate.now();
		
		Period pe = Period.between(birthday, today);
		System.out.println("birth day = " + birthday);
		System.out.println("today = " + today);
		
		long year = pe.get(ChronoUnit.YEARS) * 365;
		long month = (pe.get(ChronoUnit.MONTHS) * 365) / 12;
		long day = pe.get(ChronoUnit.DAYS);
		
		System.out.println(year + month + day + " days");
		
//		LocalDate birthDay = LocalDate.of(2000, 1, 1); // 자신의 생일을 지정
//		LocalDate now = LocalDate.now();
//		long days = birthDay.until(now, ChronoUnit.DAYS);
//		
//		System.out.println("birth day="+birthDay);
//		System.out.println("today ="+now);
//		System.out.println(days +" days");

	}
}
