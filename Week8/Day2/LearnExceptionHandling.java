package week8.day2;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		
		try {
			System.out.println(x/y);//10/0
		} 
		catch (Exception e) {
			if (y==0) {
				System.out.println(x/1);
			}
			System.out.println(e);
		}
		
		System.out.println("End of the program");
		
		
	

	}

}