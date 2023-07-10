package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {
		String str = "Ama zon";

		//convert the given String to lowercase
		String name=str.toUpperCase();
		System.out.println(name);

		//to find the length of the String
		int len = str.length();
		System.out.println(len);

		//to check whether a part of the value is present or not//boolean
		boolean contains = name.contains("zon");
		System.out.println(contains);

		if (str.contains("Zon") || str.contains("zon")) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}

		//to retrieve a particular character from a index
		char charAt = str.charAt(3);//Amazon
		System.out.println("Character at 3rd index: "+charAt);


		//to convert the given String into characters
		char[] ch = str.toCharArray();//Amazon
		System.out.println("charcter at 4th index:"+ch[4]);//A,m,a,z,o,n

		//to print all the characters
		for (int i = 0; i < ch.length; i++) {//0-7
            System.out.println(ch[i]);//ch[0]-A ch[1]-m ch[2]=a ch[3]=  ch[4]=2 ch[5]=o ch[6]=n
		}
		
	}

}
