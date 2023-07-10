package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//syntax
		List<String> mentors = new ArrayList<>();
		List<String> coach   = new ArrayList<>();
		
		
		//to add items into the list
		mentors.add("Aravind");
		mentors.add("Vidya");
		mentors.add("Ragu");
		mentors.add("Dilip");
		mentors.add("Princilla");
		mentors.add("Jagadeesh");
		mentors.add("Ragu");
		mentors.add(1, "Ram");
		
		//to print the list
		System.out.println(mentors);
		
		//to add all the items of one list to another
		coach.addAll(mentors);
		coach.add("Hari");
		
		//to find the size of coach
		System.out.println("List2 size: "+coach.size());
		
		//to find the size of the list
		int size = mentors.size();
		System.out.println("List1 size: "+size);
		
		//to get a particular element from the list
		String name = mentors.get(1);
		System.out.println(name);
		
		//to remove an element from a list
		mentors.remove(4);
		System.out.println(mentors);
		
		//to remove all the elements
		coach.removeAll(mentors);
		System.out.println(coach);
		
		//to make an list empty
		mentors.clear();
		System.out.println(mentors);
		
		
		
		
		
		
	}

}
