package study;

public class Sample01 {

	public static void main(String[] args) {
		public void ex01() {
			int x = 2;
			int y = 5;
			char c = 'A'; // 'A' 의 문자코드는 65
			
			System.out.println(1 + x << 33); 				// 이게 뭐쥬?
			System.out.println(y >= 5 || x < 0 && x > 2); 	// && 먼저 계산해서 false 나오고 y >= 5 || false 비교해서 나온 결과 true
			System.out.println(y += 10 - x++); 				// y += 10 결과 15, 15 - x++ 결과 13 -> x값 3 이 됨
			System.out.println(x += 2); 					// 3 + 2 = 5
			System.out.println(!('A' <= c && c <= 'Z'));	// 'A' <= c : true, c <= 'Z' : true, true && true = true, !true = false 
			System.out.println('C' - c);					// 67 - 65 = 2
			System.out.println('5' - '0');					// 53-48 = 5	
			System.out.println(c + 1);						// 65 + 1 = 66
			System.out.println(++c);						// 65 + 1 = 66 -> 'B'
			System.out.println(c++);						// 65 + 1 이지만 65 -> 'B', 그 다음 'B'+ 1 = 'C'
			System.out.println(c);							// 'A' ??????????????? 가 아니라 'C'
		}
		
		public void ex02() {
			int numOfApples = 123;
			int sizeOfBucket = 10;
			int numOfBucket = (numOfApples / sizeOfBucket) % sizeOfBucket == 0 ? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket) + 1;
//			int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);		
			System.out.println("필요한 바구니의 수 : " + numOfBucket);
		}
		
		public void ex03() {
			int num = 10;
//			System.out.println(num > 0 ? "양수" : "음수");
			System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
			
		}
		
		public void ex04() {
			int num = 456;
			System.out.println(num / 100 * 100);
		}
		
		public void ex05() {
			int num = 333;
			System.out.println((num / 10 * 10) + 1);
		}
		
		public void ex06() {
			int num = 24;
			System.out.println(10 - (num % 10));
		}
		
		public void ex07() {
			int fahrenheit = 100;
//			float celcius = 5 / 9f * (fahrenheit - 32);
			float celcius = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
			System.out.println("Fahrenheit: " + fahrenheit);
			System.out.println("Celcius:" + celcius);
		}
		
		public void ex08() {
			byte a = 10;
			byte b = 20;
			byte c = (byte) (a + b);
			
			char ch = 'A';
			ch = (char) (ch + 2);
			
			float f = 3 / 2f;
			long l = 3000 * 3000 * 3000L;
			
			float f2 = 0.1f;
			double d = 0.1;
			
			boolean result = (float)d==f2;
			
			System.out.println("c = " + c);
			System.out.println("ch = " + ch);
			System.out.println("f = " + f);
			System.out.println("l = " + l);
			System.out.println("result = " + result);
		}
		
		public void ex09() {
			char ch = 'z';
			boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') ? true : false);
			System.out.println(b);
		}
		
		public void ex10() {
			char ch = 'A';
			
			char lowerCase = (ch >= 'A' && 90 <= 'Z') ? (char)((int)ch + 32) : ch;
			
			System.out.println("ch : " + ch);
			System.out.println("ch to lowerCase : " + lowerCase);
			
		}
		
		public static void main(String[] args) {
			Sample01 sample = new Sample01();
//			sample.ex01();
//			sample.ex02();
//			sample.ex03();
//			sample.ex04();
//			sample.ex05();
//			sample.ex06();
//			sample.ex07();
//			sample.ex08();
			sample.ex09();
//			sample.ex10();
		}

	}

	}

}
