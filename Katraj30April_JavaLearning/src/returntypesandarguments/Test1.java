package returntypesandarguments;

public class Test1 {

	public void m1() {
		System.out.println("Without argument without return type");
	}
	
	public boolean m1(char u) {
		System.out.println("with argument with return type");
		return false;
	}
	
	public void m1(int a, boolean c, char b) {
		System.out.println("with argument without return type");
	}
	
	public char m2() {
		System.out.println("without argument with return type");
		return '$';
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.m1();   // Without argument without return type
		System.out.println(obj.m1('a')); // with argument with return type
		obj.m1(55, true, 'k');  //with argument without return type
		System.out.println(obj.m2()); //without argument with return type
	}
}
