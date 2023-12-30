package day19.exception;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exception_Types {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;

			// Arithmetic exception

			System.out.println(a / b);
			//System.out.println("Kumaran");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("hi");
		}
		 catch (Exception e) {
				e.printStackTrace();
				System.out.println("hi Kumaran");
	 }
		finally {
			System.out.println("Exception");
		}
	}
}

		/*
		 * // Index out of found exception
		 * 
		 * List<Integer> l = new LinkedList<Integer>(); l.add(50); l.add(30);
		 * System.out.println(l.get(3));
		 * 
		 * // Array index out of bound Exception
		 * 
		 * int[] a1 = new int[5]; System.out.println(a1[4]);
		 * 
		 * // String index out of bound Exception
		 * 
		 * String s = "Kumaran"; System.out.println(s.charAt(8));
		 * 
		 * // Input mismatch Exception
		 * 
		 * Scanner s1 = new Scanner(System.in); System.out.println("Enter the value");
		 * int nextint = s1.nextInt(); System.out.println(s1.nextInt());
		 * 
		 * // Null Pointer Exception
		 * 
		 * String s3 = null; System.out.println(s3.length());
		 * 
		 * // Number Format Exception String s2 = "123dd"; int parseInt = //
		 * Integer.parseInt(s2); System.out.println(parseInt);
		 */
	


