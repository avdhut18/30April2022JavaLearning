package operator;

public class Summarization {

	
	public void m1() {
		int a = 6;
		int b = 4;
		
		if(a>=b) {
			System.out.println("if body");
		}
		if(a==b) {
			System.out.println("else 1");
		}
		if (a>b) {
			System.out.println("else 2");
		}
		
		if(!(a<b)) {
			System.out.println( "if 3");
		}
		
		if ((a<b)||(b==4)) {
			System.out.println("or condition");
		}
		
		if((a>b)&&(b<a)) {
			System.out.println("And condition");
		}
	}
	
	public static void main(String[] args) {
		Summarization obj= new Summarization();
		obj.m1();
	}
	
}
