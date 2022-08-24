package stringcheck;

public class StringDisucssion {

	public static void main(String[] args) {
		
		String ss = new String("avdhut");
		//creates two object in Heap area and SCP(String Constant Pool)
		
		String s1 = new String ("avdhut");
		//if same value object is alredy present then ref var will point to that object
		
		System.out.println(s1);  //// avdhut
		
		s1 = new String ("Pawar");
		//upon changing value of ref variable which was pointing previous string , now it will point to the new String address
		//where new string obj is created 
		
		System.out.println(s1);   /// pawar
		ss = new String ("Automation");
		
		
	}
}
