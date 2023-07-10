package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {
	public static void main(String[] args) {
		int [] nums = {2,3,4,5,7,2,4,7};
		//output=2,4,7
		
		
		Set<Integer> unique = new TreeSet<Integer>();
		Set<Integer> duplicates = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicates.add(nums[i]);
			}
			
		}
		System.out.println(duplicates);
	}

}
