package day17.stringmethods;

public class String_Methods2 {
	public static void main(String[] args) {

		String a = "kumaran salem";
		String b = "KUMARAN SALEM";

		String replace = a.replace("kumaran salem", "java selenium");
		System.out.println(replace);

		String substring = b.substring(10);
		System.out.println(substring);

		boolean isempty = a.isEmpty();
		System.out.println(isempty);

		String[] split = b.split(" ");
		for (String OnebyOne : split) {
			System.out.println(split);
		}
		String trim = a.trim();
		System.out.println(trim);

		String concat = a.concat(" " + b);
		System.out.println(concat);
		
		String valueof=String.valueOf(b);
		System.out.println(valueof);
		
		int compareto=a.compareTo(b);
		System.out.println(compareto);

	}

}
