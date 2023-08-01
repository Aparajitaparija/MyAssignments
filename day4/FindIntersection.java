package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
	
	int[] num = {3,2,11,4,6,7};
	int []num1 = {1,2,8,4,9,7};
	
	List <Integer> one = new ArrayList<Integer>(); 
	List <Integer> two = new ArrayList<Integer>();	
	
	for(int i = 0; i<num.length;i++) {
		one.add(num[i]);
	}
	for(int j = 0; j<num.length;j++) {
		two.add(num1[j]);
	}
		System.out.println("The list of element in num is" +one);
		System.out.println("The list of element in num is" +two);
		
		
		for(int i =0;i<one.size();i++) {
			for(int j =0;j<two.size();j++) {
				if (one.get(i)==two.get(j)) {
					System.out.println(two.get(i));
				}
			}
		}
		
		
		
		
		
		
		

	}

}
