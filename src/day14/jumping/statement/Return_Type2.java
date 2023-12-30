package day14.jumping.statement;

public class Return_Type2 {
	
	public float add() {
		
		float a=0.025f;
		float b=0.025f;
		float c=0.025f;
		float d=a+b+c;
		return d;
		}
	public static void main(String[] args) {
		Return_Type2  rt = new Return_Type2();
		float add= rt.add();
		System.out.println(add);
	}
}
