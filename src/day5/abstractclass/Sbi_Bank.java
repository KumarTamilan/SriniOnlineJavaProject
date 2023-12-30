package day5.abstractclass;

public abstract class Sbi_Bank {
	public void Bikeloan() {
		System.out.println("Bike loan is 15%");
	}
	public abstract void Homeloan();
	
	public abstract void Educationloan();

}
 // It supports both abstract method and  non-abstract method.
 // We cannot create an object for abstract class,Because there is no implementation part.
 // By using extends keyword we can access abstract class.
 // public abstract keyword is mandatory.