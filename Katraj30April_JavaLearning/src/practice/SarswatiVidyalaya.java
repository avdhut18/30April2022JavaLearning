package practice;

public class SarswatiVidyalaya {

	int maths = 0;
	int physics;
	int chemistry;
	
	public static void main(String[] args) {
		SarswatiVidyalaya avdhut = new SarswatiVidyalaya();
		avdhut.maths=80;
		avdhut.physics=90;
		avdhut.chemistry=100;
		
		System.out.println("Marks of Avdhut: ");
		System.out.println("Maths: " + avdhut.maths);
		System.out.println("Physics: " + avdhut.physics);
		System.out.println("Chemistry: " + avdhut.chemistry);
	}
}
