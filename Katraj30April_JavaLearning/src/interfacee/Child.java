package interfacee;


public abstract class Child implements Parent {

	@Override
	public void m1() {
		System.out.println("m1 implemented");
		
	}

	@Override
	public abstract void m2();

	
	public static void main(String[] args) {
		
	}
}
