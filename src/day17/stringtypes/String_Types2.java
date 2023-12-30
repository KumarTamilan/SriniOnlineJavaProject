package day17.stringtypes;

public class String_Types2 {
	
	public static void main(String[] args) {
		
		String a ="Kumaran";
		String b ="Karuppannan";
		
		//Immutable String
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
		String concat=a.concat(b);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		
		//Mutable String
		StringBuffer sb = new StringBuffer("Kumaran");
		StringBuffer sb1 = new StringBuffer("Karuppannan");
		
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		StringBuffer append	=sb.append(sb1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
	}

}
