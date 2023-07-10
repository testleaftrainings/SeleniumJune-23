package week3.day2;

public class StringReplace {
public static void main(String[] args) {
	String str = "Chennai 600073";
	
	String str1 = "6,013"; //6013
	//output=600073 
	
	//to print only numbers
	String numbers = str.replaceAll("[^0-9]","");
	System.out.println(numbers);
	
	//to print only ASCII values
	String asciiChar = str.replaceAll("[^a-zA-Z]", "");
	System.out.println(asciiChar);
	
	String replacedString = str1.replaceAll(",", "");
	System.out.println(replacedString);//6013
	
	//to convert the String to Integer
	int convertedString = Integer.parseInt(replacedString);
	System.out.println(convertedString);
	
}
}
