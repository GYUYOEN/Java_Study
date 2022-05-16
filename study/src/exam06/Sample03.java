package exam06;

public class Sample03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될
	
	void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else if(this.money >= p.price) {
			this.money -= p.price;
			this.add(p);
		} else {
			System.out.println("잘못입력");
		}
	}
	
	void add(Product p) {
		if(i >= cart.length) {
			Product[] ncart = new Product[cart.length*2];
			for(int i = 0; i < cart.length; i++) {
				ncart[i] = cart[i];
			}
			cart = ncart;
		}
		cart[i] = p;
		i++;
	} // add(Product p)
	
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null) break;
			itemList += cart[i] + " ";
			sum += cart[i].price;
		}
		
		System.out.println("장바구니 목록 : " + itemList);
		System.out.println("장바구니 물품들 총가격 : " + sum);
		System.out.println("장바구니 물품 사고 남은 금액 : " + (this.money));
	} // summary()
}

class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

