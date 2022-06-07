package exam07;

public class Sample02 {
	public static void main(String[] args) {
		Outer2.Inner2 oi = new Outer2.Inner2();
		System.out.println(oi.iv);
	}
}

class Outer2 {
	static class Inner2 {
		int iv=200;
	}
}
