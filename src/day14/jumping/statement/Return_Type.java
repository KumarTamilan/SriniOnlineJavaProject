package day14.jumping.statement;

public class Return_Type {
	
	public int add () {
		int a=10000;
		int b=100;
		int c=a/b;
		return c;
	}
	public static void main(String[] args) {
		Return_Type r = new  Return_Type();
		int  add  = r.add();
		System.out.println(add);
	}

}
