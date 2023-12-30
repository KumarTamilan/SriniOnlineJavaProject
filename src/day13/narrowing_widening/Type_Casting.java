package day13.narrowing_widening;

public class Type_Casting {
	public static void main(String[] args) {
		
		//widening
		int a = 50;
		long b = a;
		System.out.println(b);
		
		//Narrowing
		int i = 30;
		byte y = (byte) i;
		System.out.println(y);
		
	}

}
