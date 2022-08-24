package exception;


public class ExceptionTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(4/2);
		System.out.println(6/3);
		System.out.println(12/6);
		Thread.sleep(2000);
		try {
			System.out.println(100/0);	
		}
		catch(ArithmeticException ref) {
			System.out.println
			("Exception occured due to zero number share selling but it is working fine if exception occured");
			System.out.println("Exception: " + ref.getMessage());
		}
		
		catch(NullPointerException ref) {
			System.out.println
			("Exception  Null pointer");
		}
		
		finally {
			System.out.println("finnlly is running");
		}
		System.out.println(18/9);
		System.out.println(20/10);
	}
}
