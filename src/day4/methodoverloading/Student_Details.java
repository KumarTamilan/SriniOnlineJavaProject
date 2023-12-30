package day4.methodoverloading;

public class Student_Details {  
	public void stu_detail(String a ,String b) {
		System.out.println("The student name is :"+" "+ a +" "+b);
	}
	public void stu_detail(int a,int b) {
		System.out.println("The total marks out of 500 is :"+" "+ a +" "+b);
	}
	public void stu_detail(long c,long d) {
		System.out.println("The student scholorship is :"+" "+ c +" "+ d);
	}
	
	public static void main(String[]args) {
		System.out.println("********The Top Two Ranker in the 10th Public Examination****************");
		Student_Details s = new Student_Details();
		s.stu_detail("Kumaran","Mohan");
		s.stu_detail(492,493);
		s.stu_detail(20000,30000);
	}

}
//class name,method name same.But,Parameter (or)argument will be different.