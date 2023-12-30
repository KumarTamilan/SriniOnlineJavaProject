package day12.upcastingdowncasting;

public class Hemalatha extends Amudha {
	@Override
	public void gift() {
		//super.gift();
		System.out.println("Watch,Bike");
	}
	public static void main(String[] args) {
		Amudha	 h = new  Hemalatha();
		 h.gift();
		
	}

}
