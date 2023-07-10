package week3.day1;

public class Audi extends Car{
	//type methodname and then -> ctrl+space->enter
	public void autoParking() {
		System.out.println("Auto Parking functionality ---> From Audi");

	}
	
	public static void main(String[] args) {
		Audi aud = new Audi();
		aud.applyBrake();
		aud.soundHorn();
		aud.reverseGear();
		aud.autoParking();
	}

}
