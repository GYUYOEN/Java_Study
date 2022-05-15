package exam06;

public class Sample04 {
	
	static double sumArea(Shape[] arr) {
		double result = 0.0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i].calcArea();
		}
		return result;
	}

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합 : " + sumArea(arr)); 
	}

}

abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	Shape(Point p) {
		this.p = p;
	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}

}

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}


class Circle extends Shape {
	static final double PI = 3.14;
	double r;
	
	Circle() {
		this(0);
	}
	
	Circle(double r) {
		this.r = r;
	}
	
	@Override
	double calcArea() {
		 double result = r * r * PI; 
		return result;
	}
	
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle() {
		this(0, 0);
	}
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if(width == height) {
			return true;
		}
		return false;
	}

	@Override
	double calcArea() {
		double result = width * height; 
		return result;
	}
}
	

