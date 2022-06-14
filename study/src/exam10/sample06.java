package exam10;

public class sample06 {

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") + " 개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
		
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0) {
			return 0;
		}
		
		for(int i = 0; i < src.length(); i++) {
			pos = src.indexOf(key, pos);
			if(pos != -1) {
				count++;
				pos += key.length();
			} else {
				break;
			}
		}
		
//		while((index = src.indexOf(key, pos)) != -1) {
//			count++;
//			pos = index + key.length();
//		}
		
//		while(pos < src.length()){
//          index = src.indexOf(key, pos); 
//          if(index == -1){ 
//              break;
//          }
//          pos = index + key.length(); 
//          count++;
//      }
//      return count;
		
		return count;
	}
}
