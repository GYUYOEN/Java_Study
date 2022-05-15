package exam06;

class Sample02 {
	
	static void action(Robot r) {
		DanceRobot dcr = new DanceRobot();
		SingRobot sr = new SingRobot();
		DrawRobot dr = new DrawRobot();

		if(r == dcr) {
			dcr.dance();
		} else if(r == sr) {
			sr.sing();
		} else if(r == dr) {
			dr.draw();
		} else {
			System.out.println("잘못입력");
		}
	}

	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}

class Robot {}
	
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
	
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
	
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

