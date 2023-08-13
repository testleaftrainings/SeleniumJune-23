package week8.day2;

public class LearnNestedTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int[] values = { 10, 20, 30 };
		try {
			System.out.println(x / y);
			
			try {
				System.out.println(values[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End of program");

	}

}