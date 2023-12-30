package day12.upcastingdowncasting;

public class Marriage extends Boy {
	
	@Override
	public void girlname() {
		//super.girlname();
		System.out.println("Kumar");
	}
	public static void main(String[] args) {
		 Boy m = new  Marriage();
		 m.girlname();
	}
	

}
