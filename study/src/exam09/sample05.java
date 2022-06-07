package exam09;

public class sample05 {
	
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		for(int i = 0; i < src.length();) {
			pos = src.indexOf(target, i);
			
			if(pos == -1) {
				break;
			} 
			
			count++;
			i += pos;
			i += target.length();
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB456","AB"));
		System.out.println(count("12345","AB"));
	}

}
