package day2.datatypes;

public class Employee_Details {
	
	public void emp_Id() {
		System.out.println("Employee id is 12345");
	}
	public void emp_Name() {
		System.out.println("Employee name is kumaran");
	}
	public void emp_Address() {
		System.out.println("Employee address is mettur");
	}
	public void emp_Salary() {
		System.out.println("Employee salary is 50000");
	}
	public static void main (String[]args) {
		
		Employee_Details empinfo = new Employee_Details();
		
		empinfo.emp_Id();
		empinfo.emp_Name();
		empinfo.emp_Address();
		empinfo.emp_Salary();
	}
		
	
		
	}
   
