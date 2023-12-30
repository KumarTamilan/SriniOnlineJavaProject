package day4.methodoverloading;

public class Employee_Details1 {
	public void emp_detail(String a) {
	System.out.println("Employee name is"+a);
	}
	public void emp_detail(int a) {
		System.out.println("Employee age is"+a);
	}
	public void emp_detail(String a,int b) {
		System.out.println("Employee native place"+" "+a+" "+b);
	}
	
	public void emp_detail(int a,char b) {
		System.out.println("Employee salary and grade is"+a);
	}
	public void emp_detail(float a) {
		System.out.println("Employee percendage is"+a);
	}
	public static void main(String[] args) {
		Employee_Details1 e = new Employee_Details1();
		e.emp_detail("kumaran");
		e.emp_detail(29);
		e.emp_detail("Salem",8);
		e.emp_detail(60000,'S');
		e.emp_detail(95);
	}

}
