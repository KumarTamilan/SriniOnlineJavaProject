package day7.constructor;

public class Student_Details2 {
		private String studentname;
		private int studentid;
		Student_Details2(){
		System.out.println("I am Default Constructor");
		studentname="Kumaran";
		studentid=10000001;
		}
		Student_Details2(String name,int id){
			studentname=name;
			studentid=id;
		}
		void studentinfo() {
			System.out.println("Student Name;"+studentname);
			System.out.println("Student Id;"+studentid);
		}
		public static void main(String[]args) {
			Student_Details2 s = new Student_Details2("mohan",100002);
			s.studentinfo();
			
	
			
		}

}