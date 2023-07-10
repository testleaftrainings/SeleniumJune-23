package week3.day1;

import io.opentelemetry.sdk.metrics.internal.concurrent.AdderUtil;

public class LearnOverLoading {
	//add method with no arguments
	public void add() {
		int a=10;
		int b= 20;
		System.out.println(a+b);
	}
	
	//add method with 2 input arguments
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	//add method with 3 input arguments
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		LearnOverLoading lo = new LearnOverLoading();
		lo.add(30, 90, 80);
	}
	

}
