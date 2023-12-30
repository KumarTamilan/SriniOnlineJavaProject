package day17.stringtypes;

public class String_Types4 {
	
	public static void main(String[] args) {
		
		String a="Harsha";
		String b="Harsha";
		
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
		String concat=a.concat(b);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
				
				
	}

}
