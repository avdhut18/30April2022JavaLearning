package methodslearn;

public class CheckingMethods {

	public void m1() {
		System.out.println("M1 is running");
	}
	
	public static void m2() {
		CheckingMethods obj= new CheckingMethods();
		obj.m1();
		System.out.println("M2 is running");
	}
	
	public static void main(String[] args) {
	m2();	
	}
}
