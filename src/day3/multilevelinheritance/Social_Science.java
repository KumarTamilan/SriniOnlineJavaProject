package day3.multilevelinheritance;

public class Social_Science extends Science_Subject {

	public void socialscience() {

		System.out.println("History,Civis");
	}

	public static void main(String[] args) {
		Social_Science ss = new Social_Science();
		ss.tamil();
		ss.english();
		ss.maths();
		ss.science();
		ss.socialscience();
		}

}
