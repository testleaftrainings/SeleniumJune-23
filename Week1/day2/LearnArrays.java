package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {

		//datatype[] variableName = {values};
		//index                    0   1  2  3  4  5
		int[]           scores  = {98,89,92,93,81,96};

		//to find the length of an array
		int len = scores.length; 
		System.out.println("The length of the given array is : "+len);
		
		//to retrieve a single element out of this array
		System.out.println("Single value from 2nd index : "+scores[2]);
		
		System.out.println("All values : --------------------");
		
		//to sort an array
		Arrays.sort(scores);
		//to print all the values of this array
		for (int i = len-1; i >=0; i--) {  // 6<=6
			System.out.println(scores[i]); //scores[6]=90
		}
		




	}
}
