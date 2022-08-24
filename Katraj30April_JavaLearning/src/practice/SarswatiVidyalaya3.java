package practice;

public class SarswatiVidyalaya3 {
	
	int maths;
	int chem;
	int phy;
	
	public SarswatiVidyalaya3(int maths, int chem, int phy, String studentName) {
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
		System.out.println("Marks of Student "+ studentName);
		System.out.println("Maths: "+ maths);
		System.out.println("Chemistry: "+ chem);
		System.out.println("Physics: "+ phy);
		System.out.println("total= "+totalMarks()+"\n");
	}
	
	public  int totalMarks() {
		int total = maths+chem+phy; //
	return total;
	}
	
	public static void main(String[] args) {
		new SarswatiVidyalaya3(50,88,77,"Avdhut");
		new SarswatiVidyalaya3(59,89,78,"Raju");
	}
}
