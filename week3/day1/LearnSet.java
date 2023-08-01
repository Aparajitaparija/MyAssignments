package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String companyName = "google";
	char[] n = companyName.toCharArray();
	System.out.println(n);
	
	Set<Character> unique =new LinkedHashSet<Character>();
	Set<Character> dupe =new LinkedHashSet<Character>();

	for(int i=0; i<n.length;i++) {
		
		if(!unique.add(n[i])) {
			dupe.add(n[i]);
		}
	}
		System.out.println(unique);
		System.out.println(dupe);
		
		
	}

}
