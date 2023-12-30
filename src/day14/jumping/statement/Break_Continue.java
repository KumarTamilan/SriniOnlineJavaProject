package day14.jumping.statement;

public class Break_Continue {
	public static void main(String[] args) {
		
		for (int i = 1; i >10 ; i++) {
			if(i==5) {
			//break;  //It will terminate the loop [or] exit the loop.
				continue; //It will skip the particular iteration.
				}
			System.out.println(i);
			
		}
	}

}
