package day13.narrowing_widening;

public class Pre_Post_Increment {
	
	public static void main(String[] args) {
		
		int i =8;
		
		System.out.println(i++);//8------(9)
		System.out.println(++i);//10
		System.out.println(i++);//10-----(11)
		System.out.println(++i);//12
		
	    System.out.println(i++ + ++i); //14
	}                                  //12----(13)
                                         //12+14=26
}
