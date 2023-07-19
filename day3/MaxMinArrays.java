package week1.day3;

import java.util.Arrays;

public class MaxMinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age[] = {12,56,89,90,67};
		
		Arrays.sort(age);
		//always give result in ascending order
		for(int i = 0; i<age.length;i++) {
			System.out.println(age[i]);
			//for descending
			//for(int i1 =age.length; i1>=0;i1--) {
			//System.out.println(i1);
				
			}
		
		
		System.out.println("The minimum value is" +age[0]);
		System.out.println("The maximum value is" +age[age.length-1]);
			
	}
}

