package stringcheckin3;

public class Child extends Parent {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.a="pawar";
		System.out.println(ch.a);
		
		Parent pp = new Parent();
		System.out.println(pp.a);
	}
}
