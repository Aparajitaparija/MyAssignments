package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
	
		int[] x = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> unique =new LinkedHashSet<Integer>();
		Set<Integer> duplicate =new LinkedHashSet<Integer>();
		
        for(int i=0; i<x.length;i++) {
    		
    		if(!unique.add(x[i])){
     		duplicate.add(x[i]); 
   } 
        }
    System.out.println(duplicate);
		
		
		
    		}	

	}

	
