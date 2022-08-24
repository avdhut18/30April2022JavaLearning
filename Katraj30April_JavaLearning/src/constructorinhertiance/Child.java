package constructorinhertiance;

public class Child extends Parent {
	
	public Child() {
		super(true);
		System.out.println("Child Class constructor");
	}
	
	public static void main(String[] args) {
		new Child();
	}

}
