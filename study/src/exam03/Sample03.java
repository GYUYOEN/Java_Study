package exam03;

public class Sample03 {
	
	public static boolean isNumber(String str) {
		if(str==null || str.equals(""))
			return false;
		
		boolean ox = false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				ox = true;
			} else {
				ox = false;
				break;
			}
		}
		
		if(ox) {
			return true;
		} else {
			return false;
		}

	}
	
	// 보슬
//	static boolean isNumber(String str) {
//        boolean result = true;
//        char tmp = 0;
//        for(int i = 0; i < str.length(); i++) {
//            tmp = str.charAt(i);    // 문자열 하나 저장
//            if(tmp >= 48 && tmp <= 57) {            // 숫자 범위
//                result = true;
//            }else {
//                return false;        // 숫자 중에 하나라도 FALSE가 있다면 false 반환
//            }
//        }
//
//        return true;
//    }

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));
		str = "124o";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));
		}


}
