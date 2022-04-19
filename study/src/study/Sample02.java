package study;

public class Sample02 {
	
	public void ex01() {
		/*
		 * 1. x > 10 && x <20
		 * 2. !(ch = ' ' || ch = '	') 
		 * -> !(ch = ' ' || ch = '\t')
		 * 3. ch = 'x' || ch = 'X'
		 * 4. ch >= '0' && ch <= '9'
		 * 5. (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')
		 * 6. year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))
		 * -> year % 400 == 0 || year % 4 == 0 && year % 100 != 0
		 * 7. !(powerOn)
		 * 8. str.equals("yes")
		 */
	}
	
	public void ex02() {
		int tot = 0;
		for(int i = 1; i <= 20; i++) {
			if(!(i % 2 == 0 || i % 3 == 0)) {
//		    if(i % 2 != 0 && i % 3 != 0)
				tot += i;
			}
		}
		System.out.println(tot);
	}
	
	public void ex03() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
		
//		int sum = 0;
//		int totalSum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//			totalSum += sum;
//		}
//		
//		System.out.println("totalSum = " + totalSum);
	}
	
	public void ex04() {
		int i = 1;
		int j = -2;
		int sum = 0;
		int num = 0;
		while(true) {
			sum += i;
			num++;
			if(sum >= 100) {
				break;
			}
			sum += j;
			num++;
			i += 2;
			j += -2;
		}
		System.out.println(num);
		System.out.println(sum);
		
		// 보슬
//		  int total = 1;                 // 총합
//        int sum1 = 0;    // 덧셈
//        int sum2 = 0;    // 뺄셈
//        int count = 1;            // 몇 번째에서 
//
//        while(true) {
//            count++;
//            if(count % 2 == 0) {    // 만약 짝수번째라면
//                sum1 += 2;            // sum1
//                total += sum1;        // sum = sum + sum1
//            }else if(count % 2 != 0){
//                sum2 += 2;
//                total -= sum2;            // sum = sum - sum2; 
//            }
//            if(total >= 100) {
//                break;
//            }
//        }
//        System.out.println("총합(total) : " + total);
//        System.out.println("몇 번째 : " + count);
		
		// 유라
//        int neg = 0;    // 음수
//        int pos = 0;    // 양수
//        int total2 = 0;    // 총 합계
//        int count = 0;    // 몇 까지 더하는가?
//
//        for(int i = 1;;i++) {
//            if(total2 >= 100) {
//                break;
//            } else {
//                if(i % 2 == 0) {
//                    neg = -i;
//                    total2 += neg;
//                    count += 1; 
//                } else {
//                    pos = +i;
//                    total2 += pos;
//                    count += 1;
//                }
//            }
//        }
//        System.out.printf("[4-4] 총 합계 : %d\n", total2);
//        System.out.printf("[4-4] 몇 까지 더해야 하는가? : %d\n", count);
            
		
//		int sum = 0; // 총합을 저장할 변수
//		int s = 1;	 // 값의 부호를 바꿔주는데 사용할 변수
//		int num = 0;
//		
//		for(int i = 0; sum < 100; i++, s=-s) { // 매 반복마다 s의 값은 1, -1, 1 ,-1...
//			num = s * i; // i 와 부호(s)를 곱해서 더할 값을 구한다.
//			sum += num;
//		}
//		System.out.println("num = " + num); 
//		System.out.println("sum = " + sum);
	}
	
	public void ex05() {
		int i = 0;
		while(true) {
			int j = 0;
			if(i <= 10) {
				while(true) {
					if(j <= i) {
						System.out.print("*");
					} else {
						break;
					}
					j++;
				}
			} else {
				break;
			}
			System.out.println();
			i++;
		}
		
//		int i = 0;
//		while(i <= 10) {
//			int j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
	}
	
	public void ex06() {
		int sum = 0;
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					sum++;
//					System.out.println(i + "+" + j + "=" + (i+j));
				}
			}
		}
		System.out.println(sum);
	}
	
	public void ex07() {
		int value = (int)(Math.random() * 6 + 1);
		System.out.println("value : " + value);
	}
	
	public void ex08() {
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if(2*x + 4*y == 10) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}
	}
	
	public void ex09() {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
//			sum += str.charAt(i);
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
	}
	
	public void ex10() {
		
		int num = 12345;
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("sum = " + sum);

	}
	
	public static void main(String[] args) {
		Sample02 sample = new Sample02();
//		sample.ex02();
//		sample.ex03();
//		sample.ex04();
//		sample.ex05();
//		sample.ex06();
//		sample.ex07();
//		sample.ex08();
//		sample.ex09();
		sample.ex10();
	
	}

}
