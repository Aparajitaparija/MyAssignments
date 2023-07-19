package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price[] = {12,23,78,98,45,67};
		
		Arrays.sort(price);
		int length = price.length;
		System.out.println(price[length-2]);
		
		
		
	}

}
