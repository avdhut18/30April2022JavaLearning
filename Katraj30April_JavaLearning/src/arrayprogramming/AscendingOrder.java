package arrayprogramming;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] a = {12,55,88,66,778,89,7855,8,799,558,75,467,-1,58,0};
		//Write Program for Ascending Order of Array
		int empty;	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					empty = a[i];
					a[i]  = a[j];
					a[j]  = empty;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
