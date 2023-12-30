package day3.multilevelinheritance;

class Fasion{
	public void show_details() {
		System.out.println("shopping title");
		System.out.println("offers");
		System.out.println("Mens,Womens & Kids");
	}
	
}
   class Mens extends Fasion{
	void mens_items() {
		System.out.println("T-shirts,Jeans,Trousers");
	}
}
   class ultra_fasion extends Mens {
	void wedding() {
		System.out.println("Wedding Dress Collections");
		
	}
}

public class Ecom {
	
	public static void main(String[]args) {
		//Fasion f1 = new Fasion();
		//f1.show_details();
		//Mens m1 = new Mens();
		//m1.mens_items();F		
		ultra_fasion uf1 = new ultra_fasion();
		uf1.show_details();
		uf1.mens_items();
		uf1.wedding();
	}

}
