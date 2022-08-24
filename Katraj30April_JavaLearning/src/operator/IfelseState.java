package operator;

public class IfelseState {
	int a = 20;
	int b = 25;

	public static void main(String[] args) {
		IfelseState obj= new IfelseState();
			if((obj.a<obj.b)&&(obj.b>obj.a)) 
			System.out.println("if body");
		
		else 
			System.out.println("else");
	}

}
