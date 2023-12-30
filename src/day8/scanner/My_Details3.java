package day8.scanner;                                                               // What is scanner?
                                                                                                        // 1. Scanner is a class[predefined class]
import java.util.Scanner;                                                                 //  2.Found in the Java.untill package.
                                                                                                        // 3.Scanner is the simplest way to get input in java.
public class My_Details3 {                                                               // 4.With the help of the scanner we can get input from user in primitive type and string.
	
	public static void main(String[] args) {                                       // SYNTAX:
		                                                                                               //     scanner s = new scanner(system.in)
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the customer name");                   // scanner = class
		String nextline=a.nextLine();                                                 // system.in = To take input from console
		System.out.println( nextline);                                                // new = It allocate new memory
		
		System.out.println("Enter the customer id");                        // Scanner Methods:
		int nextint=a.nextInt();                                                          //       There are 39 predefined methods,But mostly commonly used in 5 types
		System.out.println(nextint);
		                                                                                              //  1.nextline( )
		System.out.println("Enter the customer phonenumber");     //  2.nextint( )
		double nextdouble=a.nextDouble();                                     //  3.next( )
		System.out.println( nextdouble);                                          //  4.next( ).charAt( )
		                                                                                             //  5.nextfloat( )
		System.out.println("Enter the customer address");
	    boolean hasnext=a.hasNext();
		System.out.println( hasnext);
		
		System.out.println("Enter the customer colour");
		String nextline2=a.nextLine();
		System.out.println(nextline2);
		
		System.out.println("Enter the customer brother name");
		String nextline3=a.nextLine();
		System.out.println(nextline3);
		
		System.out.println("Enter the customer sister name");
		String nextline4=a.nextLine();
		System.out.println(nextline4);
		
		System.out.println("Enter the customer father name");
		String nextline5=a.nextLine();
		System.out.println(nextline5);
		
		System.out.println("Enter the customer mother name");
		String nextline6=a.nextLine();
		System.out.println(nextline6);
		
		System.out.println("Enter the customer Height");
		float nextfloat=a.nextFloat();
		System.out.println(nextfloat);
		
		System.out.println("Enter the customer Weight");
		int nextint2=a.nextInt();
		System.out.println(nextint2);
		
		System.out.println("Enter the customer salary");
		long nextlong=a.nextLong();
		System.out.println(nextlong);
		
		System.out.println("Enter the customer aadharnumber");
		int nextint3=a.nextInt();
		System.out.println(nextint3);
		
		System.out.println("Enter the customer age");
		int nextint4=a.nextInt();
		System.out.println(nextint4);
		
	}

}
