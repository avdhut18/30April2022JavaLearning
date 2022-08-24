package errorrrs;

public class StackCheck {

	
	public void m1() {
		System.out.println("m1 is running");
		m2();
	}
	
	
	public void m2() {
		System.out.println("m2 is running");
		m1();
	}
	
	public static void main(String[] args) {
		StackCheck ref = new StackCheck();
		ref.m1();
	}
}
