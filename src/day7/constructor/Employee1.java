package day7.constructor;

public class Employee1 {                                                              // What is Constructor?
	                                                                                                // 1. Class name and Constructor name will be same.
	public Employee1() {                                                                // 2.When we create on object for a class, the constructor will be automatically executed   
		System.out.println("I am default constructor");                  //  at the time itself.
		String empname = "Kumar";                                               // 3. It will not any return type.[void]   
		String name = empname;                                                    // 4. It will support Method overloading and Does not support Method overriding.
	 System.out.println("Employee name kumar");
	 System.out.println("Employee id is 1002");                            // Constructor are two types:
		}                                                                                           //  1.DEFAULT CONSTRUCTOR  [OR] NON-PARAMETERIZED CONSTRUCTOR.          
	public Employee1(String name,char grade) {                           //  2.PARAMETERIZED CONSTRUCTOR.
		System.out.println("Parameterised constructor");
		System.out.println("Employee name is"+" "+name);
		System.out.println("Employee grade is"+" "+grade);

}
	public void Employeeinfo(int id,int salary) {
		System.out.println("Employee id is"+" "+id);
		System.out.println("Employee salary is"+" "+salary);
		
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		
		
		  new Employee1("Kumaran",'S');
		  e1.Employeeinfo(12345,60000);
		 
	}

}
