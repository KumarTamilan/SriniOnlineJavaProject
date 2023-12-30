package day8.scanner;                                                       // What is scanner?
                                                                                                 // 1.Scanner is a class.[free defined class]
import java.util.Scanner;                                                          //  2.Found in the Java.untill package.
                                                                                                 // 3.Scanner is the simplest way to get input in java.
public class Employee_Detail {                                                 // 4.With the help of the scanner we can get input from user in primitive type and string.
	
	public static void main(String[] args) {                                // Scanner s = new scanner(system.in).
		
		//scanner refName = new scanner (system.in)                // scanner = class         
		                                                                                        // system.in = To take input from console
		Scanner sc = new Scanner(System.in);                            // new = It allocate new memory
		
		System.out.println("Enter the Employee Name");          // Scanner Methods:
		String name = sc.nextLine();                                          // There are 39 predefined methods,But mostly commonly used 5 methods. 
		System.out.println(name);                                
		                                                                                      // 1.nextline( )
		System.out.println("Enter the Employee id");               // 2.nextint( )
		int id = sc.nextInt();                                                      // 3.next( ) 
		System.out.println(id);                                                  // 4.next( ).charAt( )
		                                                                                     // 5.nextfloat( )
		System.out.println("Enter the Employee Grade");
		String grade = sc.next();
		System.out.println(grade);
		
		System.out.println("Enter the Employee Height");
		float height = sc.nextFloat();
		System.out.println(height);
		
		System.out.println("Enter the Employee Salary");
		long salary = sc.nextLong();
		System.out.println(salary);
		
	
		
	}

}
