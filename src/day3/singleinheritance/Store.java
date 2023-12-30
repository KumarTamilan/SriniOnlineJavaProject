package day3.singleinheritance;

public class Store extends Mobile {
	
	public void storename() {
		System.out.println("Mens wear");
		System.out.println("All New Brands");
	}
	public static void main(String[] args) {
		System.out.println("************The Mobile Show Room***********");
		Store s = new Store();
		s.mobile_name();
		s.storename();
	}

}
