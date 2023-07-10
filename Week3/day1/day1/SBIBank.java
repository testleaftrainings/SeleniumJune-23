package week3.day1;

public class SBIBank implements RBI {

	int depositAmount = 25000;
	@Override
	public void withDrawalLimit() {
		System.out.println("15Lakhs");

	}

	@Override
	public void knowYourCustomer() {
		System.out.println("AADHAR");

	}

	public void goldLoan() {
		System.out.println("10Lakhs");
	}


	public static void main(String[] args) {
		SBIBank sbi =new SBIBank();
		sbi.withDrawalLimit();
		sbi.knowYourCustomer();
		System.out.println(sbi.depositAmount);
		sbi.goldLoan();
		
		

	}




}
