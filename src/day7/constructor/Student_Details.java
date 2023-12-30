package day7.constructor;                                                    //What is Constructor?
                                                                                            // 1.Class name and Constructor name will be same.
public class Student_Details {                                              // 2.When we create on object for a class,the constructor is automatically executed
	 String stuname;                                                              //     at the time itself.
	 int stuid;                                                                        //  3.It will not any Return type[void]
	 char stugrade;                                                               //  4.It will support Method overloading and Does not support Method overriding.
	
	 Student_Details() {
		System.out.println("I am Default Constructor");       // Constructor are two types:
		stuname ="Kumaran";                                              // 1.DEFAULT CONSTRUCTOR [OR] NON-PARAMETERIZED CONSTRUCTOR.
		stuid = 1001;                                                            // 2.PARAMETERIZED CONSTRUCTOR.
		stugrade ='S';
		}
	public void Student_Details1() {
		System.out.println("Student Name:"+stuname);
		System.out.println("Student id:"+stuid);
		System.out.println("Student grade:"+stugrade);
	}
	
	public void Student_Details2(String b,int b1){
		System.out.println("Student name:"+b);
		System.out.println("Student id:"+b1);
	}
	public static void main(String[] args) {
		Student_Details sd= new Student_Details();
		sd.Student_Details2("Mani", 1003);
		
		sd.Student_Details1();

	}
}
