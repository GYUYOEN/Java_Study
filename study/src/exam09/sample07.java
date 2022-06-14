package exam09;

public class sample07 {
	
	public static boolean contains(String src, String target) {
//		if(src.contains(target)) {
//			return true;
//		}
//		
//		return false;
		
		return src.indexOf(target)!=-1;

	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
