package day9.variables; // Variable is a place of memory that can contain a data value.

public class Names { // Variables:
						                                         // 1.Local Variable: * Local variable must be inside the method.
	static float a = 0.020f;                        //                             * It's life cycle will be through out the method.
								                                 //                            * We must initialize the local variable.

	public void samplepgm() {                    // 2.Class Variable: * Class variable must be inside the class and outside the method.
							                                  	//                             * No need to initialize the class variable.
		final byte a = 100;                                  //                              * If we do not initialize value the default value of the given datatype will be printed.
		int b = 200;                                     //                             * If we give local and class variable as a same reference name the priority go to local variable.
		
	    short c = 300;                                 //3.Static Variable:  * Static variable must be inside the class and outside the method.
		long d = 400;                                 //                              * If we do not the initialize the value the default value of the given datatype will be printed.
		System.out.println(a);                    //                               * In class variable we can use the static keyword.But,we can not use the static keyword 
		System.out.println(b);                    //                               *  in local variable.
		System.out.println(c);
		System.out.println(d);

	}

	public static void main(String[] args) {
		Names n = new Names();
		n.samplepgm();
		System.out.println(a);
	}

}
