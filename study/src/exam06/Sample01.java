package exam06;

public class Sample01 {
	public static void main(String[] args) {
	}
}

abstract class Unit {
	int x, y; // 현재 위치
	abstract void move(int x, int y);
//	abstract void stop(); 
	void stop() {}
}

class Marine extends Unit { // 보병
	void move(int x, int y) {}
//	void stop() {}
	void stimPack() {}
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {}
//	void stop() {}
	void changeMode() {}
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {}
//	void stop() {}
	void unload() {}
}