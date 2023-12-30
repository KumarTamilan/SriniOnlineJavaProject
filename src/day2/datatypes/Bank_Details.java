package day2.datatypes;

public class Bank_Details {
	
	public void bankManager_Name() {
		System.out.println("Manager Kumaran");
	}
	public void bankManager_Contact() {
		System.out.println("9578608914");
	}
	public void bankManager_Location() {
		System.out.println("Salem");
	}
	public void bankManager_Branch() {
		System.out.println("Mettur Branch");
	}
	public static void main(String[] args) {
		System.out.println("******************STATE BANK OF INDIA*************************");
		Bank_Details b = new Bank_Details();
		b.bankManager_Name();
		b.bankManager_Contact();
		b.bankManager_Location();
		b.bankManager_Branch();
	}
	

}
