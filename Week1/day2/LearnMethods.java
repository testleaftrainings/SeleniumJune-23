package week1.day2;

public class LearnMethods {

	public int getCycleNumber() {
       System.out.println("HAi");
		return 2;
	}

	//to create a method->type methodName->ctrl+space->enter

	public boolean hadLunch() {
		return true;

	}

	public void getTimeOut() {
		System.out.println("No");

	}

	public String getCycleColor(String brandName,String color) {

		return brandName +" "+color;
	}
	
	public static void main(String[] args) {
		//ClassName objectname = new ClassName();
		LearnMethods lm = new LearnMethods();
		System.out.println(lm.getCycleNumber());
		
		//ctrl+2,release and then press l
		boolean result= lm.hadLunch();
		System.out.println(result);
		
		String cycleColor = lm.getCycleColor("Hercules", "Black");
		System.out.println(cycleColor);
		
		lm.getTimeOut();
		
	}
	
	



}
