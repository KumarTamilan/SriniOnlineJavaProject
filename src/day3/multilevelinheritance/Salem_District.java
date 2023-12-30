package day3.multilevelinheritance;

public class Salem_District extends Thirunelveli_District  {
	
	public void famousmango() {
		System.out.println("Mango");
	}
	public static void main(String[]args) {
		Salem_District sd = new Salem_District();
		sd.famousmango();
		sd.famousalva();
		sd.famouskarumbu();
		sd.famouspattasu();
		sd.famouspoottu();
		sd.anothername();
	}

}
