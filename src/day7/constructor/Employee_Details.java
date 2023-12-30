package day7.constructor;                                                           // What is Constructor?
                                                                                                   // 1. Class name and Constructor name is will be same.
public class Employee_Details {                                                  // 2. When we create on object for a class,the Constructor is automatically executed 
	String empname;                                                                    //      at the time itself.
                                                                                                   // 3. It will not have any return type[void]
	Employee_Details() {                                                               // 4.It will support Method overloading and Does not support Method overriding.
		System.out.println("I am Default Constructor");
		empname = "Mohan";
	}
	public void Employee_Details1() {                                          // Constructor are two types:
		System.out.println("Employee name is:" + empname);      // 1.DEFAULT CONSTRUCTOR [OR] NON-PARAMETERIZED COSTRUTOR.
	}                                                                                             // 2.PARAMETERIZED CONSTRUCTOR.

	Employee_Details(String a) {
		System.out.println("I am Parameterized Constructor");
		System.out.println("Employee name:" + a);
	}

	Employee_Details(int a) {
		System.out.println("I am Parameterized Constructor");
		System.out.println("Employee id is:" + a);
	}

	Employee_Details(char a) {
		System.out.println("I am Parameterized Constructor");
		System.out.println("Employee grade is:" + a);
	}

	Employee_Details(long b) {
		System.out.println("I am Parameterized Constructor");
		System.out.println("Employee Salary is:" + b);
	}

	Employee_Details(float a) {
		System.out.println("I am Parameterized Constructor");
		System.out.println("Employee Height is:" + a);
	}
	

	public static void main(String[] args) {
		Employee_Details ed = new Employee_Details();
		ed.Employee_Details1();
		Employee_Details ed1 = new Employee_Details("Kumaran");
		Employee_Details ed2 = new Employee_Details(1001);
		Employee_Details ed3 = new Employee_Details('S');
		Employee_Details ed4 = new Employee_Details(55000);
		Employee_Details ed5 = new Employee_Details(6.6f);
	}

}
