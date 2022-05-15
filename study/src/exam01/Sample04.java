package exam01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sample04 {
	public void ex01() {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}
		
		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 보슬
//		  int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
//        int[] counter = new int[4];
//
//        for(int i = 0; i < answer.length; i++) {    // 숫자가 몇 개 나왔는지 확인하는 for문
//            //(1)
//            if(answer[i] == 1) {        // answer[i]의 값이 각각 1,2,3,4 라면 그에 맞게 
//                counter[0]++;            // counter[0]을 숫자 1을 count하는 용도로 사용
//            }else if(answer[i] == 2) {
//                counter[1]++;
//            }else if(answer[i] == 3) {
//                counter[2]++;
//            }else if(answer[i] == 4) {
//                counter[3]++;
//            }
//
//        }
//
//        for(int  i = 0; i < counter.length;i++) {        // 출력해주기 위한 for문
//            String star = "*".repeat(counter[i]);
//            System.out.println(counter[i] + " " + star);
//
//            System.out.println();
//        }
	}
	
	public void ex02() {
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
//				result[j][i] = star[i][j];
				int x = j;
				int y = star.length - 1 - i;
				
				result[x][y] = star[i][j];
			}
		}
		
        for(int i = 0 ; i < result.length; i++)    {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
		
		// 보슬
//        for(int i = 0; i < star.length; i++) {
//            for(int j = 0; j < star[i].length; j++) {
//                System.out.print(star[i][j]);
//            }
//            System.out.println();        // 개행
//        }
//        System.out.println();            // 개행
//
//        for(int i = 0; i < star.length;i++) {            // star.length : 4 ([0]~[3])
//            for(int j = 0; j < star[i].length;j++) {    // star[i].length : 5([0]~[4])
//                result[j][(star.length)-i-1] = star[i][j];
//            }
//        }
//        for(int i = 0 ; i < result.length; i++)    {
//            for(int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }
        

	}
	
	public void ex03() {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			  '(',')','-','_','+','=','|','[',']','{',
			  '}',';',':',',','.','/'};

		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			
		String src = "abc123";
		String result = "";
		
//		for(int i = 0; i < src.length(); i++) {
//			char ch = src.charAt(i);
//			
//			if('a' <= ch && ch <= 'z') {
//				result += abcCode[ch - 'a'];
//			} else if('0' <= ch && '9' >= ch) {
//				result += numCode[ch - '0'];
//			}
//		}

		char[] temp1 = new char[abcCode.length];
		int idx1 = 0;
		for(int i = 97; i < 123; i++) {
			temp1[idx1] = (char)i;
			idx1++;
		}
		
		char[] temp2 = new char[numCode.length];
		int idx2 = 0;
		for(int i = 48; i < 58; i++) {
			temp2[idx2] = (char)i;
			idx2++;
		}
		
		for(int i = 0; i < src.length();i++) {
			char ch = src.charAt(i);
			for(int j = 0; j < abcCode.length; j++) {
				if(ch == temp1[j]) {
					result += abcCode[j];
					break;
				} 
			}
			for(int j = 0; j < numCode.length; j++) {
				if(ch == temp2[j]) {
					result += numCode[j];
					break;
				} 
			} 
			
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
	
	public void ex04() {
		int[][] score = {
			{100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
			};
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
//				result[5][j] += result[i][j];
//				result[i][3] += result[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
				
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void ex05() {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				count++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.%n%n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추었습니다.", words.length, count);
	    
	}
		
	public void ex06() {
		String[] words = { "television", "computer", "mouse", "phone" };
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			int r = rand.nextInt(question.length);
			
			char temp1 = question[i];
			question[i] = question[r];
			question[r] = temp1;
						
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = scanner.nextLine();
		
			if(words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			} else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}
	
	public static void main(String[] args) {
		Sample04 sample = new Sample04();
//		sample.ex01();
//		sample.ex02();
//		sample.ex03();
//		sample.ex04();
//		sample.ex05();
		sample.ex06();
	}
}
