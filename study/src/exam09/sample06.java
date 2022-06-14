package exam09;

import java.util.Arrays;

public class sample06 {

	public static String fillZero(String src, int length) {		
		if(src == null || src.length() == length) {
			return src;
		} else if(length <= 0) {
			return "";
		} else if(src.length() > length) {
			return src.substring(0 ,length);
		}
		
		char[] c = new char[length];
		for(int i = 0; i < length; i++) {
			c[i] = '0';
		}
		
//		char[] temp = new char[src.length()];
//		for(int i = 0; i < src.length(); i++) {
//			temp[i] = src.charAt(i);
//		}
//		
//		for(int i = 0; i < src.length(); i++) {
//			c[length - src.length() + i] = temp[i];
//		}
//		
//		String s = "";
//		for(int i = 0; i < length; i++) {
//			s += c[i];
//		}
//		
//		return s;
		
		System.arraycopy(src.toCharArray(), 0, c, length-src.length(), src.length());
		
		return new String(c);

 	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}


}
