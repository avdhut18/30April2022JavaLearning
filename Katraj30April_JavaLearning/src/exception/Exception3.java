package exception;

public class Exception3 {

	public void votingAge(int age) {
		if(age>18)
			System.out.println("elgible for voting");
		else
			throw new ArithmeticException("underage");
	}
	
	public static void main(String[] args) {
		Exception3 obj = new Exception3();
		try {
			obj.votingAge(2);	
		}
		catch(ArithmeticException ref) {
			System.out.println(ref.getMessage());
		}
		
	}
}
