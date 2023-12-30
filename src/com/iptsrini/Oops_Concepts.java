package com.iptsrini;

public class Oops_Concepts {
	private void managerName() {

		String name = "DEIVABALAN";
		System.out.println("Bank Manager  Name is:"+name);
	}
	private void contactNumber() {

		long contno = 9578608914l;
		System.out.println("Bank Manager Contact Number:"+contno);
	}
	private void manaderId() {

		int id = 2222;
		System.out.println("Bank Manager Id:"+id);
	}
	private void branchLocation() {

		String branch ="Anna Nager";
		System.out.println("Branch Name is:"+branch);
	}
	public static void main(String[] args) {
		Oops_Concepts  oc = new Oops_Concepts();
		oc.managerName();
		oc.contactNumber();
		oc.manaderId();
		oc.branchLocation();
	}

}
