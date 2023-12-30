package day8.scanner;                                                    // What is scanner?
                                                                                              // 1. Scanner is a class.[free defined class]
import java.util.Scanner;                                                       // 2. Found in the Java.untill package.
                                                                                             // 3. Scanner is the simplest way to get input in java.
public class My_Details {                                                      // 4. With the help of the scanner we can get input from user primitive type and string.
                                                                                        
	public static void main(String[] args) {                            // SYNTEX:
		// Scanner refName = new scanner(system.id)           //             scanner s = new scanner(system.in)            

		Scanner sc = new Scanner(System.in);                        //        scanner = class
                                                                                           //        system.in = To take input from console
		System.out.println("Enter the My name");                 //        new = It allocate new memory
		String name = sc.nextLine();
		System.out.println(name);                                         //  Scanner Methods:
                                                                                          // There are 39 predefined methods,But mostly commenly used 5 types.
		System.out.println("My father name");                     
		String name1 = sc.nextLine();                                    // 1.nextline( )
		System.out.println(name1);                                       // 2.nextint( ) 
                                                                                         // 3.next( )
		System.out.println("My mother name");                  // 4.next( ).charAt( )
		String name2 = sc.nextLine();                                  // 5.nextfloat( )
		System.out.println(name2);

		System.out.println("My job");
		String job = sc.nextLine();
		System.out.println(job);

		System.out.println("My salary");
		long salary = sc.nextLong();
		System.out.println(salary);

		System.out.println("My height");
		float height = sc.nextFloat();
		System.out.println(height);

		System.out.println("My weight");
		int weight = sc.nextInt();
		System.out.println(weight);

		System.out.println("My place");
		String place = sc.next();
		System.out.println(place);

		System.out.println("My  pincade");
		long pincode = sc.nextLong();
		System.out.println(pincode);
	}

}
