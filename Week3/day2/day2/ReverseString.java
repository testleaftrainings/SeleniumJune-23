package week3.day2;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "Amazon development centre";
		
		//split
		String[] split = str.split(" ");
		System.out.println(split.length);
		
		for (int i = split.length-1; i >=0; i--) {
			
			System.out.println(split[i]);
		}
		
	}

}
