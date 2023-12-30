package day4.methodoverloading;

public class Employee_Details {
	public void empdetail(int a, int b) {
		System.out.println("Employee Id is" + " " + a + " " + b);
	}

	public void empdetail(String a, String b) {
		System.out.println("Employee Name is" + " " + a + " " + b);
	}

	public void empdetail(long a,long b) {
		System.out.println("Employee Salary is" + " " + a + " " + b);
	}

	public void empdetail(char a, char b) {
		System.out.println("Employee Grade is" + " " + a + " " + b);
	}

	public static void main(String[] args) {
		Employee_Details ed = new Employee_Details();
		ed.empdetail(5001, 5002);
		ed.empdetail("kumaran", "deva");
		ed.empdetail(50000l, 60000l);
		ed.empdetail('S', 'S');
	}

}
