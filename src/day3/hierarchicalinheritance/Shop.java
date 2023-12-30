package day3.hierarchicalinheritance;

class Fasion {
	void show_details() {
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
class women extends Fasion {
	void wedding() {
		System.out.println("Wedding Dress Collections");
		
	}
}
class Kids_Boy extends Fasion{
	void kids_items() {
		System.out.println("Baby apron,socks,shoes,safety pins,singlet,mittens,overalls");
	}
}

public class Shop {
	
	public static void main(String[]args) {
	Mens obj1 = new Mens();
	women obj2 = new women();
	Kids_Boy obj3 = new Kids_Boy();
	
	obj1.show_details();
	obj1.mens_items();
	obj2.wedding();
	obj3.kids_items();
			
	}
	
}
		
