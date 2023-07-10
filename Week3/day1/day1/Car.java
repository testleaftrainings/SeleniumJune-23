package week3.day1;

public class Car extends Vehicle{
	
	
	public void applyBrake() {
		System.out.println("ABS brake ---> from Car class");

	}
	public void reverseGear() {
             System.out.println("Gear applied --> From Car class");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.applyBrake();
		
		Vehicle vec = new Vehicle();
		vec.applyBrake();
	}
	
}
