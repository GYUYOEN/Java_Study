package exam11;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Sample08 {

	public static void main(String[] args) {
		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId zid1 = ZoneId.of("America/New_York");
		ZonedDateTime newyorkTime = ZonedDateTime.now().withZoneSameInstant(zid1);
		
		System.out.println(seoulTime);
		System.out.println(newyorkTime);
		
//		long sec1 = seoulTime.getOffset().getTotalSeconds();
//		long sec2 = newyorkTime.getOffset().getTotalSeconds();
//		long diff = (sec1 - sec2)/3600;
		
//		System.out.println("sec1="+sec1);
//		System.out.println("sec2="+sec2);
//		System.out.printf("diff=%d hrs%n",diff);
		
//		LocalDateTime = LocalDate + LocalTime
//		ZonedDateTime = LocalDateTime + Time Zone
//		ZonedDateTime zdt1 = ZonedDateTime.of(LocalDateTime.of(2016, 01, 28, 23, 01, 00), ZoneId.of("Asia/Seoul"));

	}

}
