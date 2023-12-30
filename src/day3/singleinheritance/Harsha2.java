package day3.singleinheritance;

public class Harsha2 extends Harsha {
	
	public void namechange() {
		System.out.println("Harshanth changes in Thangakatti");
	}
	public void rithvikcolour() {
		System.out.println("Rithvik colour is white");
	}
	public void sistercolour() {
		System.out.println("No colour");
	}
	public void unclecolour() {
		System.out.println("lightwhite");
	}
	public static void main(String[] args) {
		Harsha2 h1 = new Harsha2 ();
		h1.brothername();
		h1.name();
		h1.namechange();
		h1.rithvikcolour();
		h1.sistername();
		h1.sistercolour();
		h1.unclename();
		h1.unclecolour();
	}
	

}
