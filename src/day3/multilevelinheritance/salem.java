package day3.multilevelinheritance;

class animal {
	void view1() {
		System.out.println("Eating");
	}
}

class dog extends animal {
	void view2() {
		System.out.println("Wooow");
	}
}

class cat extends dog {
	void view3() {
		System.out.println("Meow");
	}
}

class babycat extends cat {
	void view4() {
		System.out.println("Crying");
	}
}

public class salem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		babycat bc = new babycat();
		bc.view1();
		bc.view2();
		bc.view3();
		bc.view4();

	}

}
