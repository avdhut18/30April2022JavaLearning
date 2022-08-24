package variablesss;

public class GlobalVar {

	int a = 20; // global non static variable 
	int b = 20; // global non static variable
	
	public void m1() {  //non static method 
		int a = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void m2() {
		GlobalVar obj= new GlobalVar();
		 int c = obj.a + obj.b;
		 System.out.println(c);
	}
	
	public static void main(String[] args) {
		GlobalVar obj = new GlobalVar();
		obj.m1();
		m2();
	}
}
