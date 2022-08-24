package abstractionnn;

public class Child extends Parent {
	
	
	public Child() {
		System.out.println("child con");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("m1");	
	}

	
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
	}
}
