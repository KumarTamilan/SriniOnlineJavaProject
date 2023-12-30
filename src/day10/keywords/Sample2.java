package day10.keywords;

public class Sample2  extends Sample1 {
	int a = 300;
	
	public void method2() {
		int a = 400;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Sample2  s = new Sample2 ();
		s.method2();
	}

}
