package exam03;

public class Sample02 {

	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		if(isPowerOn) {
			isPowerOn = false;
		} else {
			isPowerOn = true;
		}
		
//		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			volume++;
		}
	}
	void volumeDown() {
		if(volume > MIN_VOLUME) {
			volume--;
		}
	}
	void channelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		channel--;
	}
	
	public static void main(String args[]) {
		Sample02 S = new Sample02();
		
		S.channel = 100;
		S.volume = 0;
		System.out.println("CH:" + S.channel+", VOL:"+ S.volume);
		
		S.channelDown();
		S.volumeDown();
		System.out.println("CH:"+S.channel+", VOL:"+ S.volume);
		
		S.volume = 100;
		S.channelUp();
		S.volumeUp();
		System.out.println("CH:"+S.channel+", VOL:"+ S.volume);
	}

}
