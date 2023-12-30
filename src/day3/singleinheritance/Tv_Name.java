package day3.singleinheritance;

public class Tv_Name extends Tv_Colour{
	public void svmsungtv() {
		System.out.println("Svmsung");
	}
	public void sonytv() {
		System.out.println("Sony");
	}
	public static void main (String[]args) {
		Tv_Name tn = new Tv_Name();
		tn.blackcolour();
		tn.sonytv();
		tn.yellowcolour();
		tn.svmsungtv();
	}
	
}
