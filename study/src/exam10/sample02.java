package exam10;

public class sample02 {
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)"," \t"));

	}
	
	static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src);
		for(int i = 0; i < sb.length(); i++) {
			for(int j = 0; j < delCh.length(); j++) {
				if(sb.charAt(i) == delCh.charAt(j) ){
					sb.deleteCharAt(i);
					break;
				}
			}
		}
		return sb.toString();
		
//		StringBuffer sb = new StringBuffer(src.length());
//		for(int i=0; i < src.length();i++) {
//			char ch = src.charAt(i);
//			if(delCh.indexOf(ch)==-1) {
//				sb.append(ch);
//			}
//		}
//		return sb.toString(); 
		
//        StringBuffer sb = new StringBuffer(src.length());
//        for(int i = 0 ; i < src.length(); i++){ // 삭제할 문자열의 길이만큼
//            char dc = src.charAt(i);  // 삭제할 문자 추출
//            if(delCh.indexOf(dc) == -1){  // 금지된 문자열에 해당하는지 확인, 만약 해당 문자를 가지고 있지 않다면
//                sb.append(dc);
//            }
//        }
//        return sb.toString();
	}

}