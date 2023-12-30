package day5.abstractclass;

public class Family_Members2 extends Family_Members {

	@Override
	public void myfathername() {
		System.out.println("My father name is Karuppannan");
		}

   @Override
	public void mymothername() {
	   System.out.println("My Mother name is amudha");
	}
   
   public static void main(String[] args) {
	   Family_Members2 fm = new Family_Members2();
	   fm.myname();
	   fm.myfathername();
	   fm.mymothername();
}

} 
