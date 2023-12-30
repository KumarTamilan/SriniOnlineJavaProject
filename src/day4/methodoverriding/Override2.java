package day4.methodoverriding;

public class Override2 extends Override1 {
	@Override
	public void student_details() {
		super.student_details();
	}

	@Override
	public void student_details1() {
		super.student_details1();
	}

	@Override
	public void student_details2() {
		super.student_details2();
	}
	public static void main(String[] args) {
		Override2 ov = new Override2();
	ov.student_details();
	ov.student_details1();
	ov.student_details2();
	}

}
