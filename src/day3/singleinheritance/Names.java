package day3.singleinheritance;

public class Names extends Animal{
	public void cat() {
		System.out.println("Cat");
	}
	public void lion() {
		System.out.println("Lion");
	}
	public void dog() {
		System.out.println("Dog");
	}
public static void main(String[]args) {
	Names n = new Names();
	n.biganimal();
	n.mediumanimal();
	n.smallanimal();
	n.lion();
	n.dog();
	n.cat();
}
	

}
