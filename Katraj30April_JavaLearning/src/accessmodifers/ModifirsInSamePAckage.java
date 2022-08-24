package accessmodifers;

public class ModifirsInSamePAckage   {

	
	
	public void m1() {
		
	}
	
	
	public static void main(String[] args) {
		
		Modifiers obj = new Modifiers();
		obj.m1();  // <default>
		Modifiers.m2();
	}
}
