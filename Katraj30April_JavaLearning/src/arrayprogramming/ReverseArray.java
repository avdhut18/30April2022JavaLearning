package arrayprogramming;

public class ReverseArray {

	//program to reverse An Array
	

	public static void main(String[] args) {
		
		int[] a = {12,55,66,88,99,88,45,669,8,55,89,55,66,778,666,8887,99,65,88,88,456,5,8};
		
		//Printing of given Array
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+ " ");
		
		System.out.println();
		
		//Printing of reverse Array
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+ " ");
		
	}
}
