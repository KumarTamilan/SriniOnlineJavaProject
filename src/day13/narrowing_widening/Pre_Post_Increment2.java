package day13.narrowing_widening;

public class Pre_Post_Increment2 {
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(++a);//11
		System.out.println(a++);//11------(12)
		System.out.println(++a);//13
		System.out.println(++a);//14
		System.out.println(++a);//15
		System.out.println(++a);//16
		System.out.println(a++);//16-------(17)
		System.out.println(a++);//17-------(18)
		System.out.println(a++);//18-------(19)
		System.out.println(++a);//20
		System.out.println(a++);//20-------(21)
		System.out.println(++a);//22
		System.out.println(++a);//23
		System.out.println(++a);//24
		System.out.println(a++);//24-------(25)
		
		System.out.println(++a  +  ++a  +  a++  +  ++a  +  a++);
	}                                //26         27        27          29        29
                                                             //(28)                    (30)
}
