package day3.hierarchicalinheritance;

public class Karuppa extends  Dog {
	public void karuppapuppy() {
		System.out.println("The dog gave five bones to the Karuppa puppy");
	}
	public static void main(String[] args) {
		 Karuppa k = new  Karuppa();
			Jack j = new Jack();
			Tommy t = new Tommy();
			Jimmy j1 = new Jimmy();
			k.puppynames();
			j1.jimmypuppy();
			t.tommypuppy();
			j.jackpuppy();
			k.karuppapuppy();
		
	}

}
