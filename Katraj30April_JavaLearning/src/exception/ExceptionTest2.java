package exception;

public class ExceptionTest2 {

	public void m1(int marks) {
		if(marks<=40)
			throw new IllegalArgumentException("Student marks <40");
		else
			System.out.println("Student is passed and move to next class");
	}
	
	public static void main(String[] args) {
		ExceptionTest2 obj = new ExceptionTest2();
		try {
			obj.m1(5);	
		}
		catch(IllegalArgumentException ref) {
			System.out.println("Exception Reason: " + ref.getMessage());
		}
		
		
	}
}
