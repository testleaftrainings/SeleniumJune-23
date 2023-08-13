package week8.day2;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		
		int[] values = {10,20,30}; 
		//want to handle a particular exception
		//ArrayIndexOutOfBoundExceptio
		//ArithmeticException
		

		try {
			System.out.println(x / y); 
			System.out.println(values[3]);//0 1 2
		} 
		  catch (ArithmeticException e) {
			  if (y==0) {
				System.out.println(x/1);
			}
			 
		  }catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println(e);
		  }
		   catch(Exception e) {
			   System.out.println(e);
		   }
		
		System.out.println("End of program");

	}

}