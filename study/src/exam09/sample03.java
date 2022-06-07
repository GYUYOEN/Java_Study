package exam09;

public class sample03 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		fullPath = fullPath.replaceAll("'\\'", "'\'");
		
		int index = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0, index);
		
		fileName = fullPath.substring(index+1);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}
