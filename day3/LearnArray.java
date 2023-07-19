package week1.day3;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age[]= {12,13,34,56,68};
			System.out.println(age[3]);	
			//for knowing the number of element
		int length = age.length;
		System.out.println(length);
		System.out.println(age[length-2]);
	//for the middle number
		System.out.println(age[length/2]);
	//for printing all the values
		System.out.println(age);
		//it wont give
		//it will give the location of the values in the memory
		//we have to use loop
		for(int i = 0;i<length;i++) {
			System.out.println(age[i]);
		
	//	for(int j=length-1;j>=0;j--) {
	//		System.out.println(age[j]);
		}
		
		}
	
	}

	


