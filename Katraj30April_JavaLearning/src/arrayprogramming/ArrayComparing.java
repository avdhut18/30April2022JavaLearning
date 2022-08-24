package arrayprogramming;

import java.util.Arrays;

public class ArrayComparing {

	public static void main(String[] args) {
		
	int[] a = {1,2,35,5};
	int[] b = {4,56,89,8};
	int[] c = {1,2,35,5};
	
	System.out.println(Arrays.equals(a, b));  //false
	System.out.println(Arrays.equals(a, c));  //true
	System.out.println(Arrays.equals(b, c)); // false
 
	}
}
