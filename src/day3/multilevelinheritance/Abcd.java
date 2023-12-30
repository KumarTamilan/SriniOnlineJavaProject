package day3.multilevelinheritance;
class A {
	void test1() {
		System.out.println("Smile");
	}
	
}
class B extends A {
	void test2() {
		System.out.println("angry");
	}
}
class C extends B {
	void test3() {
		System.out.println("bad");
	}
}
class D extends C {
	void test4() {
		System.out.println("sad");
	}
}

public class Abcd {
	public static void main(String[]args) {
		D d = new D();
		d.test4();
		d.test2();
		d.test3();
		d.test1();
	}

}
