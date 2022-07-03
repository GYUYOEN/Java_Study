package exam11;

import java.text.SimpleDateFormat;
import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;
import java.util.Calendar;
import java.util.Date;

public class Sample07 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("F번째 E요일입니다.");
		for(int i = 1; i <= 31 ; i++) {
			cal.set(2016, 11, i);
			Date day = cal.getTime();
			if(sdf2.format(day).equals("4번째 화요일입니다.")) {
				System.out.println(sdf1.format(day));
			}
		}

//		LocalDate date = LocalDate.of(2016, 12, 1);
//		System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));
	}

}
