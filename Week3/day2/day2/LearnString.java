package week3.day2;

public class LearnString {
	public static void main(String[] args) {
		//String Declaration -> String literal, String instantiation
		//String literal -> String pool(special type of memory )
		String name = "TestLeaf";
		String name2 = "Testleaf";
		//String instantiation -> Heap memory
		String str = new String("TestLeaf");
		String str2 = new String("TestLeaf");
	
		
		//to compare two values 
		//== operator will check only the reference
		if (name==str) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		//to compare the values/content of String
		if (str.equals(str2)) {
			System.out.println("Both are equal");
			
		}
		else {
			System.out.println("Not equal");
		}
		
		
		//to ignore case sensitivity between two Strings
		if (name.equalsIgnoreCase(name2)) {
			System.out.println("Cases ignored and both are equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
