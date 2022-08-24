package errorrrs;


public class AssertionJaava {

	int b = 20;
	
	
	public static void main(String[] args) {
		int marks = 39;
		assert marks >= 40 : "failed";
		System.out.println("mark is " +marks);
	}
}
