package day5.abstractclass;

public abstract class Animal1 {
	public void lionweight() {
		System.out.println("The lion weight is 100 Kilograms");
	}
	public abstract void dogweight();
	
	public abstract void catweight();

}
   // It supports both abstract method and non-abstract method.
  // We cannot create an object for abstract class,Because there is no implementation part.
  // By using extends keyword we can access abstract class.
  // Public abstract keyword is mandatory.