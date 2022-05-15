package exam04;

import java.util.Random;

public class Sample02 {
	
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

class SutdaDeck extends SutdaCard{
	final int CARD_NUM = 20;
	Random rand = new Random();
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for(int i=0;i < cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	public void shuffle() {
		for(int i = 0; i < CARD_NUM; i++) {
			int r = rand.nextInt();
			SutdaCard temp;
			
			temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
	}
	
	public SutdaCard pick() {
		int r = rand.nextInt(20)+1;
		return pick(r);
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
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}