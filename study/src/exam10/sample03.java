package exam10;

public class sample03 {

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬

	}
	
	static String format(String str, int length, int alignment) {
//		if(str.length() > length) {
//			return str.substring(0, length);
//		} else {
//			String s = "";
//			char[] c = new char[length]; 
//			for(int i = 0; i < length; i++) {
//				c[i] = ' ';
//			}
//			System.arraycopy(str.toCharArray(), 0, c, alignment , str.length());
//			
//			for(int i = 0; i < length; i++) {
//				s += c[i];
//			}
//			
//			return s;
//		}
		
		int diff = length - str.length();
		if(diff < 0) return str.substring(0, length);
		
		char[] source = str.toCharArray();
		char[] result = new char[length];
		
		for(int i=0; i < result.length; i++)
		result[i] = ' ';
		
		switch(alignment) {
			case 0 :
			default :
				System.arraycopy(source, 0, result, 0, source.length);
				break;
			case 1 :
				System.arraycopy(source, 0, result, diff/2, source.length);
				break;
			case 2 :
				System.arraycopy(source, 0, result, diff, source.length);
				break;
		}
		return new String(result);
		
//		if(alignment == 0) {
//            System.arraycopy(stArr, 0, cArr, 0, stArr.length);
//            return new String(cArr);
//        } else if(alignment == 1) {
//            System.arraycopy(stArr, 0, cArr, (length - str.length())/2, stArr.length);
//            return new String(cArr);
//        } else {
//            System.arraycopy(stArr, 0, cArr, (length - str.length()), stArr.length);
//            return new String(cArr);
//        }

//	public static String format(String str, int length, int alignment){
//		if(length < str.length()){ 
//			  return str.substring(0, length);
//		}
//		char ch[]  = str.toCharArray();
//		char result[] = new char[length];
//		for(int i = 0 ; i < result.length; i++){
//			  result[i]=' ';
//		}
//		if(alignment == 0){
//			  System.arraycopy(ch, 0, result, 0, ch.length);
//		} else if(alignment == 1){
//			  System.arraycopy(ch, 0, result, (length - str.length())/2, ch.length);
//		} else if(alignment == 2){
//			  System.arraycopy(ch, 0, result, length - ch.length, ch.length);
//		}
//			  return String.valueOf(result);
//		}

	}
	
}
