package day5.abstractclass;

public class Indian_Bank1 extends Indian_Bank {

	@Override
	public void Twowheelerloan() {
		System.out.println("Twowheeler loan is 12%");
		}

	@Override
	public void SmallBusinessloan() {
		System.out.println("Small Business loan is 10%");
		}

	@Override
	public void perdayloan() {
		System.out.println("Perday loan is 13%");
		}
	public static void main(String[] args) {
		Indian_Bank1 ib = new Indian_Bank1();
		ib.Bikeloan();
		ib.Homeloan();
		ib.perdayloan();
		ib.SmallBusinessloan();
		ib.Twowheelerloan();
	}

}
