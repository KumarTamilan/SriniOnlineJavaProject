package day4.methodoverriding;

public class Friend2 extends  Friend1 {
	@Override
	public void bestfriend() {
		
		super.bestfriend();
		System.out.println("My best friend is mohan");
	}
	public static void main(String[] args) {
		Friend2 f = new Friend2();
		f.bestfriend();
		f.bestfriend1();
	}
	
		
	}


