package week1.day2;

public class LearnContinue {
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			if (i==3) {
				System.out.println("Three");
				continue; // skip the current iteration
			}
			System.out.println(i); // 1 2 Three 3 4  5 6 7 8 9 10
		}
		System.out.println("Out of for loop");
		
	}
	

}
