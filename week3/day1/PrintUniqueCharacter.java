package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String name = "aparajita";
		char[] a = name.toCharArray();
		System.out.println(a);
		
		Set<Character> uni =new HashSet<Character>();
		Set<Character> dupe =new HashSet<Character>();
		
		for(int i = 0 ;i<a.length;i++) {
			if(!uni.add(a[i]))dupe.add(a[i]);
			}
			
		System.out.println(uni);	
		System.out.println(dupe);	
		}
		
		

	}


