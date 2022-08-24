package practice;

public class SarswatiVidyalaya4 {
	int maths;
	int phy;
	int chem;

	public SarswatiVidyalaya4(int maths, int phy, int chem, String stuName) {
		this.maths = maths;
		this.phy = phy;
		this.chem = chem;
		System.out.println("Marks Of Student:" + stuName);
		System.out.println("Maths: " + maths);
		System.out.println("Physics: " + phy);
		System.out.println("Chemistry: " + chem);
		totalMarks(stuName);
	}
	
	public void totalMarks(String studentName) {
		int total = maths + phy + chem;
		System.out.println(total);
		if ((maths > 40) && (phy > 40) && (chem > 40) && (total > 120))
			System.out.println("Pass" + "\n");
		else
			System.out.println("Fail" + "\n");
	}

	public static void main(String[] args) {
		new SarswatiVidyalaya4(32, 35, 31, "Raju");
		new SarswatiVidyalaya4(80, 88, 90, "Avdhut");
		new SarswatiVidyalaya4(40,40,35,"Joy");
	}
}
