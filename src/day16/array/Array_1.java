package day16.array;

public class Array_1 {
	
	public static void main(String[] args) {
		
		int a[ ] = new int [7]; // 0 to n-1(n=length)
		/*int b[ ] = { 10,20,30,40,50};
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		
		for (int OnebyOne : b) {
			System.out.println(OnebyOne);
			*/
	//	}
			
		//}
		
		
		a[0] = 100;
		a[1] = 200;
	    a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		a[5] = 600;
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
