package stringcheck;

public class StringDiscussion3 {

	String a = "velocity";
	//String is by default immutable and final in JAVA
	
	public static void main(String[] args) {
		StringDiscussion3 obj = new StringDiscussion3();
		obj.a = "Automation";
		System.out.println(obj.a);
		
		// because upon Changing the string object content it will always create new object
		// It will not update or change the existing object content
		
	}
}
