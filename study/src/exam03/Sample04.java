package exam03;

import java.util.Arrays;

public class Sample04 {
	public static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) { 
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
		}
		return arr[0];
	}
	
	// 정답
//	public static int max(int[] arr) {
//
//		if(arr==null || arr.length==0) {
//			return -999999;
//		}
//	
//		int max = arr[0]; // . 배열의 첫 번째 값으로 최대값을 초기화 한다
//		
//		for(int i=1; i< arr.length;i++) { // . 배열의 두 번째 값부터 비교한다
//		
// 		if(arr[i] > max)
//			max = arr[i];
//		}
//	
//		return max;
//	
//	}
	
	public static void main(String[] args){
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 :" + max(data));
		System.out.println("최대값 :" + max(null));
		System.out.println(" :" + max(new int[]{}));
	}
}
