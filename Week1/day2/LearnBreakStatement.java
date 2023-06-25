package week1.day2;

public class LearnBreakStatement {
	
	public static void main(String[] args) {
		//Print numbers from 10 to 1
		//When  it finds 7 -> Seven -> stop the iteration
		for (int i = 10; i > 0; i--) {
			if(i==7) {//7==7 -> true
				System.out.println("Seven"); // Seven
				break; // exit out of the loop immediately
			}
			System.out.println(i);// 10 9 8	Seven
		}
		System.out.println("Out of for loop");
	}

}
