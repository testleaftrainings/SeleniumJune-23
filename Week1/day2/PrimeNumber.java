package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		//find whether the given input is Primenumber or non Prime
		//PrimeNumber - divisible by one and itself
		int input = 20;
		boolean isPrime = true;
		
		//iterate through a for loop
		for (int i = 2; i < input; i++) {  // input % i
			if (input % i == 0) {//  7%6 == 0 -> false 
				isPrime = false;  
				break;	
			}
		}
		if (isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Non Prime");
		}
	}

}
