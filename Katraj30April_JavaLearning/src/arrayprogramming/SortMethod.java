package arrayprogramming;

import java.util.Arrays;

public class SortMethod {

	public static void main(String[] args) {
		int[] a = {12,55,886,76,78,-12,8,0,558,66};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
