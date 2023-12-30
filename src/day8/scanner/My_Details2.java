package day8.scanner;                                                   // What is scanner?
                                                                                             // 1.scanner is a class[free defined class]
import java.util.Scanner;                                                      // 2.Found in the Java.untill package.
                                                                                            // 3.Scanner is the simplest way to get input in java.
public class My_Details2 {                                                   // 4.With the help of the scanner we can get input from user primitive type and string.
	
	public static void main(String[] args) {                            // SYNTEX:
		                                                                                    //             scanner s = new scanner(system.in)
		//Scanner  refName = new Scanner(system.in)       
		                                                                                   //      scanner = class
		Scanner m = new Scanner(System.in);                        //      system.in = To take input from console
		                                                                                   //      new = It allocate new memory
		System.out.println("Enter the name");
		String a = m.nextLine();                                             // Scanner Methods:
		System.out.println("My name is "+a);                       //       There are 39 predefined methods,But mostly commonly used in 5 types.
		
		System.out.println("Enter the Contact Number");     // 1.nextline( )
		String b = m.nextLine();                                            // 2.nextint( )
		System.out.println("My contact Number is "+b);      // 3.next( )
		                                                                                  // 4.next( ).charAt( )
		System.out.println("Enter the location");                  // 5.nextfloat( )
		String c = m.nextLine();
		System.out.println("My Location is "+c);
		

	}

}
