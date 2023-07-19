package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Findupes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(nums);
		for(int i = 0;i<nums.length-1;i++) {
			if(nums[i]== nums[i+1]) {
				System.out.println(nums[i]);
				}
		
		
		
		
		}
		
		
		
	}

}
