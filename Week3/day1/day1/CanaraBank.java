package week3.day1;

public class CanaraBank implements RBI{

	@Override
	public void withDrawalLimit() {
	   System.out.println("20Lakhs");
		
	}

	@Override
	public void knowYourCustomer() {
		System.out.println("PAN card");
		
	}
	
	public static void main(String[] args) {
		CanaraBank cb = new CanaraBank();
		cb.withDrawalLimit();
		cb.knowYourCustomer();
	}

}
