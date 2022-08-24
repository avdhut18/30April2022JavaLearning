package variablesss;

public class LocalVar {

	static int a = 44;
	
	public static void main(String[] args) {
		int a = 55;
		System.out.println(a); //55
		System.out.println(LocalVar.a); //44
	}
}
