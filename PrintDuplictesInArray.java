package week1.day3;

import java.util.Arrays;

public class PrintDuplictesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,13,67,11,11,12,67,56,34,23,56};
		Arrays.sort(arr);
		int length = arr.length;
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println(arr[i+1]);
			}
			
		}
		}
		

	}


