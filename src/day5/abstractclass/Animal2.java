package day5.abstractclass;

public class Animal2 extends Animal1 {

	@Override
	public void dogweight() {
		System.out.println("The dog weight is 35 Kilograms");
}

	@Override
	public void catweight() {
		System.out.println("The cat weight is 3 Kilograms");
	}
	
	public static void main(String[] args) {
		Animal2 a = new Animal2();
		a.lionweight();
		a.dogweight();
		a.catweight();
	}

}
