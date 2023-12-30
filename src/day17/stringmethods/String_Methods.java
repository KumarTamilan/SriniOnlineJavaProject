package day17.stringmethods;

public class String_Methods {

	public static void main(String[] args) {

		String a = " salEm";
		String b = "KUMARAN FROM SALEM METTUR";

		int length = a.length();
		System.out.println(length);

		boolean equals = a.equals(b);
		System.out.println(equals);

		boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		System.out.println(equalsIgnoreCase);

		String toUpperCase = b.toUpperCase();
		System.out.println(toUpperCase);

		String LowerCase = a.toLowerCase();
		System.out.println(LowerCase);

		boolean startsWith = b.startsWith("kumaran");
		System.out.println(startsWith);

		boolean endsWith = b.endsWith("SALEM");
		System.out.println(endsWith);

		boolean contains = b.contains("FROM");
		System.out.println(contains);

		int indexOf = b.indexOf("A");
		System.out.println(indexOf);

		int lastIndexOf = a.lastIndexOf("m");
		System.out.println(lastIndexOf);

		char charAt = b.charAt(20);
		System.out.println(charAt);
	}

}
