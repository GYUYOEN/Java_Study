package exam02;

public class Sample03 {
	static double getDistance(int x, int y, int x1, int y1) {
		double d  = (x-x1)*(x-x1) + (y-y1)*(y-y1);
		return Math.sqrt(d);
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
	
	// 보슬
//	static double getDistance(int x, int y, int x1, int y1) {
//
//        double l = Math.sqrt(Math.pow(x-x1 ,2) + Math.pow(y-y1, 2)); 
//        return l;
//
//    }
}
  // 유라
//class MyPoint {
//    int x;
//    int y;
//
//    MyPoint(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    double getDistance(int x1, int y1) {
//        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x, y는 인스턴스 변수
//    }
//
//}
//
//
//public class Ch06_getDistance {
//
//    // 두 점 (x, y)와 (x1, y1) 간의 거리를 구한다.
//    static double getDistance(int x, int y, int x1, int y1) {
//        return Math.sqrt((x1 - x) + (y1 - y));
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(getDistance(1, 1, 2, 2));
//
//
//        MyPoint p = new MyPoint(1, 1);
//
//        // p와 (2, 2)의 거리를 구한다.
//        System.out.println(p.getDistance(2, 2));
//
//
//    }
//}

