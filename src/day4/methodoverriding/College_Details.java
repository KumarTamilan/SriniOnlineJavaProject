package day4.methodoverriding;

public class College_Details extends  School_Detail {
	
	public void collegename() {
		System.out.println("Sapthagiri college of engineering");
	}
	public void collegestrength() {
		System.out.println("College strength is 2500 members");
	}
	public void collegearea() {
		System.out.println("College area is Dharmapuri");
	}
	@Override
	public void schoolname() {
		
		super.schoolname();
	}
	@Override
	public void schoolstrength() {
	
		super.schoolstrength();
	}
	@Override
	public void schoolarea() {
		
		super.schoolarea();
	}
	public static void main(String[] args) {
		 College_Details c = new  College_Details();
		 c.schoolname();
		 c.schoolstrength();
		 c.schoolarea();
		 c.collegename();
		 c.collegestrength();
		 c.collegearea();
	}
	

}
