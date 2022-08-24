package practice;

public class EvenNumbers {

	public static void main(String[] args) {
		int x = 1;
		while(x<=100) {
			if(!(x%2==0))
				System.out.print(x + " ");
			x++;
		}	
	}
}
