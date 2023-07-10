package week3.day1;

public class AxisBankNaganallur extends AxisBank{

	@Override
	public void withDrawalLimit() {
		System.out.println("12Lakhs");
		
	}

	@Override
	public void cibilScore() {
		System.out.println("8%");
		
	}
	
	public static void main(String[] args) {
		AxisBankNaganallur ab = new AxisBankNaganallur();
		ab.cibilScore();
		ab.knowYourCustomer();
		ab.withDrawalLimit();
	}

}
