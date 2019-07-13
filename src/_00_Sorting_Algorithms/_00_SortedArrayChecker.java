package _00_Sorting_Algorithms;

import java.util.Random;

public class _00_SortedArrayChecker {
	
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	public static void main(String[]args) {
		int[] integers= new int[6];
		double[] newintegers= new double[6];
		Random r= new Random();
		for(int y=0; y<integers.length;y++) {
			integers[y]= r.nextInt(100);
		}
		_00_SortedArrayChecker matthew= new _00_SortedArrayChecker();
		intArraySorted(integers);
		
	}
	public static boolean intArraySorted(int[]integers) {
		for(int u=0; u<integers.length-1;u++) {
			
			System.out.println(u);
		if(integers[u]>integers[u+1]) {
			//array ascending order- index at 0. check if the value of element 1 is greater than element 0. 
		return false;
		}
		}
		return true;
	}


	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	public static boolean doubleArraySorted(double[]integers3) {
		for(int j=0; j<integers3.length-1;j++) {
			System.out.println(j);
			if(integers3[j]>integers3[j+1]) {
				return false;
			}
		}
		return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	public static boolean charArraySorted(char[]integers4) {
		for(int y=0; y<integers4.length-1;y++){
			System.out.println(y);
			if(integers4[y]>integers4[y+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	public static boolean stringArraySorted(String[]integers5) {
for(int p=0; p<integers5.length-1;p++) {
	System.out.println(p);
	if(integers5[p].compareTo(integers5[p+1])>0) {
		return false;
	}
}		
return true;
	}
}
