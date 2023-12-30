package day3.hierarchicalinheritance;

public class Chithambaram_Temple extends Salem_Temple {
	
	public void thillainadarajar() {
		System.out.println("Thillainadarajar Temple - Chithambaram");
			
	}
	public static void main(String[]args) {
	Chithambaram_Temple ct = new Chithambaram_Temple();
	Chennai_Temple c = new Chennai_Temple();
	ct.bathrakaaliyamman();
	ct.thillainadarajar();
	c.kabaleeswarar();
	
	
	
	}
}
