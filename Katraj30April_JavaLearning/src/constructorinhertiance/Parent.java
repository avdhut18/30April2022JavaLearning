package constructorinhertiance;

public class Parent {

	public Parent(int a) {
		
		System.out.println("Parent Class Constructor");
	}	
	
	public Parent (boolean c) {
		this(55);
		System.out.println("another contrctor parent");
	}
}
