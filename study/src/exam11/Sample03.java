package exam11;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Sample03 {

	public static void main(String[] args) {
		String s = "123,456,789.5";
		System.out.println("data : " + s);
		
		// Math.round 안쓰고 믿에 거와 같이 써도 반올림 된다.
//		DecimalFormat df = new DecimalFormat("#");
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		try {
			// pasrseInt메서드는 콤마가 있는 문자열을 숫자로 변환할 수 없다.
			Number num =  df.parse(s);
			
			double d = num.doubleValue();
			System.out.println("반올림 : " + Math.round(d));
			System.out.println("만단위 : " + df2.format(d));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
