package array;

public class CheckingArray {
	
	
	public static void main(String[] args) {
		System.out.println("Demo");
	int[] inAr = new int[4];   ///defined size of an array = 4
	
	// Initializing array with values
	inAr[0] = 12;
	inAr[1] = 15;
	inAr[2] = 14;
	inAr[3] = 16;
	
	for(int i = 0; i<inAr.length; i++)
		System.out.println(inAr[i]);
	}
}
