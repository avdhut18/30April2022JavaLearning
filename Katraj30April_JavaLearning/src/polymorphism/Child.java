package polymorphism;

public class Child extends Parent {
	
	int a = 55;

	public static void m1() {
		System.out.println("static method of m1 child");
	}
	
	
	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.println(obj.a); 
	}
}