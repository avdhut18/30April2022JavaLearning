package constructor;

public class Test {

	
	String BrandName;

	public Test() {
		this.BrandName = "Velocity";
	}
	
	public String getName() {
		
		return this.BrandName;
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.getName();
		System.out.println("Brand: " + obj.getName());
	}
}
