package exam11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력헤주세요. (입력예:2007/05/77)");
		
		while(s.hasNext()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("날짜를 " + pattern + "의 형태로 입력헤주세요. (입력예:2007/05/77)");
			}
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("입력하신 날짜는 E요일 입니다.");
		System.out.println(sdf.format(inDate));
	}

}
