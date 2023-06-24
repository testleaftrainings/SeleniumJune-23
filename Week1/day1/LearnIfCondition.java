package week1.day1;

public class LearnIfCondition {
	public static void main(String[] args) {
		int number = 0;
		//Find whether the given number is positive or negative or neutral
		if(number>0) {//0>0 ->  false
			System.out.println("The given number "+number+ " is Positive");
		}
		else if(number<0) {//0<0->false
			System.out.println("The number is negative");
		}
		else if(number==0) {
			System.out.println("The number is neutral");
		}
		
	}

}
