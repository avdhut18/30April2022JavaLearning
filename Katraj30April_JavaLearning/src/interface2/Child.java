package interface2;

public class Child implements Parent1,Parent2{

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		Child ob = new Child();
		ob.m1();
		ob.m2();
	}





}
