package day12.upcastingdowncasting;

public class Kumar extends  Karuppannan {
	@Override
	public void propertyname() {
		//super.propertyname();
		System.out.println("Tv,Mobile");
	}
	public static void main(String[] args) {
		Karuppannan k = new Kumar();
		k.propertyname();
	}
	
		
		
	

}
