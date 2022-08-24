package inheritance;

public class ChildClass extends ParentClass {

	static int b = 20;
	 
	public void m1() {
		System.out.println("m1 is method of Child");
	}
	
	 public void hh() {
		 System.out.println(super.a); 
	 }

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
		m3();
		obj.hh();
		System.out.println(obj.a); /// 20
		ParentClass pp = new ParentClass();
		System.out.println(pp.a);

	}
}
