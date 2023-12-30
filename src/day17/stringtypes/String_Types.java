package day17.stringtypes;

public class String_Types {
	
	public static void main(String[] args) {
		
		String a ="Selenium";
		String b ="Selenium";
		
		//Immutable String
				System.out.println(a);
				System.out.println(System.identityHashCode(a));
				System.out.println(b);
				System.out.println(System.identityHashCode(b));
				
				String concat=a.concat(" "+b);
				System.out.println(concat);
				System.out.println(System.identityHashCode(concat));
				
				StringBuffer sb = new StringBuffer("Selenium");
				StringBuffer sb1 = new StringBuffer("Selenium");
				
				//Mutable String
				System.out.println(a);
				System.out.println(System.identityHashCode(sb));
				System.out.println(b);
				System.out.println(System.identityHashCode(sb1));
				
				StringBuffer append=sb1.append(" "+sb);
				System.out.println(append);
				System.out.println(System.identityHashCode(append));
				
			}

		}

		