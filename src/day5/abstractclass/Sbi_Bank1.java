package day5.abstractclass;

public class Sbi_Bank1 extends Sbi_Bank {

	@Override
	public void Homeloan() {
		System.out.println("Home loan is 20%");
		}

	@Override
	public void Educationloan() {
		System.out.println("Educatin loan is 5%");
		}
	
	public static void main(String[] args) {
		Sbi_Bank1 sb = new Sbi_Bank1();
		sb.Bikeloan();
		sb.Homeloan();
		sb.Educationloan();
	}

}
