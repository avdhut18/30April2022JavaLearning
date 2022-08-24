package accessmodifers;

  final class Modifiers {

 final String userName = "avdhut"; 
 final String password = "avdhut123";
	
	 public void m1() {
		System.out.println("Non static m1 method");
	}
	
	 public static void m2() {
		System.out.println("Static method of parent");
	}
	
	 public static void main(String[] args) {
		 Modifiers obj = new Modifiers();
	}
}
