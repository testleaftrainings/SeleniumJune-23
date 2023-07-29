package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test(priority=3)
	public void eat() {
		System.out.println("Eat");
	}
	
	@Test(priority=1)
	public void walk() {
		System.out.println("Walk");
	}
	@Test(priority=1)
	public void run() {
		System.out.println("Run");
	}
	@Test(priority=-1)
	public void sleep() {
		System.out.println("Sleep");
	}

}
