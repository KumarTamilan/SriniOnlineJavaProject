package day5.abstractclass;

public abstract class Family_Members {                      // It supports both abstract method and  non-abstract method.
	public void myname() {                                              // We cannot create an object for abstract class,Because there is no implementation
		System.out.println("My name is Kumaran");     //                                                                                                                            part.
	}                                                                                      // By using "extends" keyword we can access the abstract class.
	public abstract void myfathername();                     // Public abstract keyword is mandatory.
	
	public abstract void mymothername();

}
