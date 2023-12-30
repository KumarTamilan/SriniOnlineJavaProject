package day6.interface1;

public class Akon_Bank3 implements Akon_Bank1,Akon_Bank2 {

	@Override
	public void Bookloan() {
		System.out.println("Bookloan is 10%");
			}
   @Override
	public void Bridgeloan() {
	   System.out.println("Bridgeloan is 11%");
			}

	@Override
	public void Mobileloan() {
		System.out.println("Mobileloan is14%");
			}

	@Override
	public void Acloan() {
		System.out.println("Acloan is 12%");
		}

	@Override
	public void Tvloan() {
		System.out.println("Tvloan is 11%");
		}

	@Override
	public void Watchloan() {
		System.out.println("Watchloan is 13%");
			}

	@Override
	public void Laptoploan() {
		System.out.println(" Laptoploan is 14%");
			}

	@Override
	public void Chairloan() {
		System.out.println("Chairloan is 13%");
			}
	public static void main(String[] args) {
		 Akon_Bank3 ab = new  Akon_Bank3();
		 ab.Acloan();
		 ab.Bookloan();
		 ab.Bridgeloan();
		 ab.Chairloan();
		 ab.Laptoploan();
		 ab.Mobileloan();
		 ab.Tvloan();
		 ab.Watchloan();
	}

}
