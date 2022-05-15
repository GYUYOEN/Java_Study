package exam01;

import java.util.Random;

public class Sample03 {
	public void ex01() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2);
		
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}
		
	}
	
	public void ex02() {
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= 3; j++) {
//				int x = j + 1 + (i - 1) / 3 * 3;;
//				int y = i % 3 == 0 ? 3 : i % 3;
//				
//				if(x > 9) break;
//				
//				System.out.print(x + " * " + y + " = " + x*y + "\t");
//			}
//			System.out.println();
//			if(i % 3 == 0) System.out.println();	
//		}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
	
	public void ex03() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i < value.length(); i++) {
			if(!(value.charAt(i) >= '0' && value.charAt(i) <= '0')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
	
	public void ex04() {
		Random rand = new Random();
		int answer = rand.nextInt(100)+1;
//		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
				count++; 
				System.out.print("1과 100사이의 값을 입력하세요 : ");
				input = s.nextInt();
				
				if(input == answer) {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					break;
					
				} else if(input < answer) {
					System.out.println("더 큰 수를 입력하새요.");
				} else {
					System.out.println("더 작은 수를 입력하새요.");
				}
		} while(true);
		
	}
	
	public void ex05() {
		String number = "12345";
		boolean result = false;
		
		for(int i = 0; i < number.length(); i++) {
			if(number.charAt(i) == number.charAt(number.length() - (i+1))) {
				result = true;
			} else {
				result = false;
				break;
			}
			
			if(i == (number.length() - (i+1))){
				break;
			}
		}
		if(result) {
			System.out.println(number + "는 회문수입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		
		
//		int number = 12321;
//		int tmp = number;
//		
//		int result = 0;
//		
//		while(tmp != 0) {
//			result = result * 10 + tmp % 10;
//			tmp / = 10;
//		}
//		
//		if(number == result) {
//			System.out.println(number + "는 회문수입니다.");
//		} else {
//			System.out.println(number + "는 회문수가 아닙니다.");
//		}
	}
	
	public void ex06() {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
	
	public void ex07() {
		int[][] arr = {
			{5, 5, 5, 5, 5},
			{10, 10, 10, 10, 10},
			{20, 20, 20, 20, 20},
			{30, 30, 30, 30, 30},
		};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		
		int l = 0; 
		for(int i = 0; i <arr.length; i++) {
			l += arr[i].length;
		}
		average = (float)total / l;
		
//		average = total / (float)(arr.length * arr[0].length);

		System.out.println("total = " + total);
		System.out.println("average = " + average);
		
//		int total = 0;
//        float average = 0;
//        int count = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                total += arr[i][j];
//           	  count++;
//            }
//        }
//        average = (float)total / (float)count;
//
//        System.out.println("total = " + total);
//        System.out.println("average = " + average);
	}
	
	public void ex08() {
		Random rand = new Random();
		int ball = rand.nextInt(900)+100;
		
		System.out.println(ball);
	
//		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int[] ball3 = new int[3];
//		
//		for(int i = 0; i < ballArr.length; i++) {
//			int j = (int) (Math.random() * ballArr.length);
//			int tmp = 0;
//		
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//
//		}
//		
//		System.arraycopy(ballArr, 0, ball3, 0, 3);
//		
//		for(int i = 0; i < ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
	}
	
	public void ex09() {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		int res = 0;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			res = money / coinUnit[i]; 
			System.out.printf("%d원 = %d\n", coinUnit[i], res);
			money = money % coinUnit[i];
		}
		
//		// 유라 풀이
//		int[] coinUnit = {500, 100, 50, 10};
//
//        int money = 2680;
//        System.out.println("money = " + money);
//
//        for(int i = 0; i < coinUnit.length; i++) {
//            if(money % coinUnit[i] < coinUnit[i]) { // 다음 값이 500이 넘으면 안된다 생각
//                int num = money / coinUnit[i];
//                money %= coinUnit[i];
//                System.out.println(coinUnit[i] + "원 : " + num);
//            }
//        }
	}
	
	public static void main(String[] args) {
		Sample03 sample = new Sample03();
//		sample.ex01();
		sample.ex02();
//		sample.ex03();
//		sample.ex04();
//		sample.ex05();
//		sample.ex06();
//		sample.ex07();
//		sample.ex08();
//		sample.ex09();
	}
}
