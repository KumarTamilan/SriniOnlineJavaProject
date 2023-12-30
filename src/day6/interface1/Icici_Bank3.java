package day6.interface1;

public class Icici_Bank3 implements Icici_Bank1, Icici_Bank2 {

	@Override
	public void penloan() {
		System.out.println("penloan is 13%");
	}

	@Override
	public void tvloan() {
		System.out.println("tvloan is 10%");
	}

	@Override
	public void cdloan() {
		System.out.println("cdloan is 14%");
	}

	@Override
	public void keyloan() {
		System.out.println("keyloan is 15%");
	}

	@Override
	public void simloan() {
		System.out.println("simloan is 14%");
	}

	@Override
	public void keyboardloan() {
		System.out.println("keyboardloan is 17%");
	}

	@Override
	public void bagloan() {
		System.out.println("bagloan is 15%");
	}

	@Override
	public void sheetloan() {
		System.out.println("sheetloan is 16%");
	}

	public static void main(String[] args) {
		Icici_Bank3 i3 = new Icici_Bank3();
		i3.bagloan();
		i3.cdloan();
		i3.keyboardloan();
		i3.keyloan();
		i3.penloan();
		i3.sheetloan();
		i3.simloan();
		i3.tvloan();
	}

}
