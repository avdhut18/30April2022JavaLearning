package practice;

public class SarswatiVidyalaya2 {

	int maths;
	int chem;
	int phy;
	
	public void generlize(int maths,int chem,int phy, String studentName) {
		this.maths=maths;
		this.chem=chem;
		this.phy=phy;
		System.out.println("Marks of Student " + studentName);
		System.out.println("Maths :" + maths);
		System.out.println("Chem :" +chem);
		System.out.println("Phy :" +phy);
		totalMarks(studentName);
		System.out.println("\n");
	}
	
	public void totalMarks(String StudentName) {
		int total = maths+chem+phy;
		System.out.println("Total marks of "+StudentName+"="+total);
	}
	
	public static void main(String[] args) {
		SarswatiVidyalaya2 obj = new SarswatiVidyalaya2();
		obj.generlize(66, 88, 45, "Raju");
		obj.generlize(88, 99, 77, "Avdhut Pawar");
	}

}
