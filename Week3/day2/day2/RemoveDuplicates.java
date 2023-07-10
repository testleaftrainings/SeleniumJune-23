package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {4,2,3,5,6,7,5,2};
		//output=[2,3,4,5,6,7]
		
		Set<Integer> unique = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);//boolean
		}
		System.out.println(unique);
		
		

	}

}
