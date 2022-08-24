package inheritance;

public class ChildClass1 extends ChildClass{
	
	static int a = 100;
	public void hh1() {
		System.out.println(super.a);
		hh();

	}

	public static void main(String[] args) {
		System.out.println(a);// 100
	}
}
