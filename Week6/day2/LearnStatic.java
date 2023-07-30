package week6.day2;

public class LearnStatic {
	
	int empId;
	String empName;
	static String companyName;
	
	public void setValues(int id, String name,String cName) {
		
        empId=id;
        empName=name;
        companyName=cName;
	}
	
	public void printValues() {
		System.out.println(empId+" "+empName+" "+companyName);
	}
	
	public static void sample() {
		System.out.println("I am  a static method");

	}
	
	public static void main(String[] args) {
		sample();
		
		LearnStatic ls = new LearnStatic();
		ls.setValues(100, "Subraja", "TestLeaf");
		ls.printValues();
		
		LearnStatic ls1 = new LearnStatic();
		ls1.setValues(200, "Vidhya", "Qeagle");
		ls.printValues();
		ls1.printValues();
		
		
		
	}

}
