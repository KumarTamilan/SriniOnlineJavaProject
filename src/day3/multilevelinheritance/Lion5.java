package day3.multilevelinheritance;

public class Lion5 extends Lion4 {
	
	public void lioncolour5() {
		System.out.println("Lion5 is Rose colour");
	}
	
	public static void main(String[] args) {
		 Lion5 l = new  Lion5();
		 l.lioncolour();
		 l.lioncolour1();
		 l.lioncolour2();
		 l.lioncolour3();
		 l.lioncolour4();
		 l.lioncolour5();
	}

}
