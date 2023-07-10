package week3.day1;

public class Bajaj extends Auto{
	
	int noOfWheels = 3;
	
	public void autoStart() {
		System.out.println("Auto Start--> From Bajaj class");

	}
	
	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		bj.applyBrake();
		bj.soundHorn();
		bj.applyMeter();
		bj.autoStart();
		System.out.println(bj.noOfWheels);
	}

}
