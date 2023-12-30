package day5.abstractclass;

public class Kumaran2 extends Kumaran1 {

	@Override
	public void mobilenumber() {
		System.out.println("Mobile number is 9578608914");

	}

	@Override
	public void simname() {
		System.out.println("Sim name is JIO");
	}
	public static void main(String[] args) {
		Kumaran2 k= new Kumaran2();
		k.kumaranmobile();
		k.mobilenumber();
		k.simname();
	}

}
