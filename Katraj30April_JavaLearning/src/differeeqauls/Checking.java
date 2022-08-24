package differeeqauls;

public class Checking {

	// == Vs .equals
	
	public static void main(String[] args) {
		String a = "avdhut";
		String b = "avdhut";
		
		String c = new String ("avdhut");

	
		System.out.println(a==b);  // true
		System.out.println(a==c); // false
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //true
		
	}
	
}
