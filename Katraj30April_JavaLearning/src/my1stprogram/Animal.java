package my1stprogram;

public class Animal {

	int a = 20;
	float b = 20.3f;
	String requiredBark = "Barking";   //state
	String requredRun = "Running";
	char c = 'a';
	char d = '@';
	
	public void barking() {             //   Behaviour 
		System.out.println(requiredBark);
	}
	
	public void running() {
		System.out.println(requredRun);
	}
	
	public static void main(String[] args) {	
		Animal ob = new Animal(); /// 
		ob.barking();  //no garabge
		System.out.println("+---++++-+-+-+");//garbage collection 
		System.out.println("455646");
		ob.running();/// objectgets created depending on requirement of action 
// garbage collection 		
	}
}
