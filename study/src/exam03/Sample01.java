package exam03;

import java.util.Random;

public class Sample01 {
	
	public static int[] shuffle(int[] original) {
//		if(original == null || original.length == 0) {
//			return original;
//		}
		
		Random rand = new Random();
		int[] arr = original;
		for(int i = 0; i < original.length; i++) {
			int r = rand.nextInt(original.length);
			
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;				
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
