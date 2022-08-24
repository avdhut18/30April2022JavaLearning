package casting;

public class Child extends Parent {

	public void m3() {
		System.out.println("child m3");
	}

	public static void main(String[] args) {
		Parent objCh = new Parent();
	
		
		Child objNew = (Child)objCh;
		objNew.m3();
	}
}
