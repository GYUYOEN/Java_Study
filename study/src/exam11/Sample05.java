package exam11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Sample05 {

	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
	}
	
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		if(yyyymmdd1.length() != 8 || yyyymmdd2.length() != 8) {
			return 0;
		}
		int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
		int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6));
		int day1 = Integer.parseInt(yyyymmdd1.substring(6));
		
		int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
		int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6));
		int day2 = Integer.parseInt(yyyymmdd2.substring(6));
		
		int day = ((year1 - year2)*365) + (((month1 - month2)*365)/12) + (day1 - day2);
		
		return day;
		
//		int diff = 0;
//		try {
//			int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
//			int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
//			int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
//			int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
//			int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
//			int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
//			Calendar date1 = Calendar.getInstance();
//			Calendar date2 = Calendar.getInstance();
//			date1.set(year1, month1, day1);
//			date2.set(year2, month2, day2);
//			diff = (int)((date1.getTimeInMillis()-date2.getTimeInMillis())/(24*60*60*1000));
//		} catch(Exception e) {
//			diff = 0; // substring(), parseInt() 에서 예외가 발생하면 0을 반환한다.
//		}
//		return diff;

	}

}
