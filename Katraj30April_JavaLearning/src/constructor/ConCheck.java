package constructor;

public class ConCheck {

	public ConCheck(int a,boolean c) {
		this(true,66); //con2
		System.out.println("constructor1 is running");
	}
	
	public ConCheck(boolean c,int a) {
		this(); //con3
		System.out.println("constructor2 is running");
	}
	
	public ConCheck() {
		System.out.println("constructor3 is running");
	}
	
	public static void main(String[] args) {
		new ConCheck(66, true);  //con1
	}
}
