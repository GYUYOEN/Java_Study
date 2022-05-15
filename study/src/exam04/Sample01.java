package exam04;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0;i < cards.length;i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			
			cards[i] = new SutdaCard(num, isKwang);
			
			// 보슬
//			int idx = 0;
//	        boolean bool = false;
//	        for(int i = 0; i < 2; i++) {
//	            for(int j = 1; j < 11; j++) {
//
//	                if((idx+1) == 1   (idx+1) == 3   (idx+1) == 8) { // 광인 경우
//	                    bool = true;
//	                }else {
//	                    bool = false;
//	                }
//	                cards[idx] = new SutdaCard(j, bool);
//	                idx++;
//	            }
//	        }
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
}

public class Sample01{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
	}
}


