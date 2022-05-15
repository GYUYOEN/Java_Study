package exam02;

public class Sample04 {
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x1, int y1) {
		double d  = (this.x-x1)*(this.x-x1) + (this.y-y1)*(this.y-y1);
		return Math.sqrt(d);
	}
}
