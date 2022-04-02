package UNIT_01;

/* Types of variables:
	   - In Java, there are three types of variables:

	. Local Variables- declared inside the body of a method

	. Instance Variables- Instance variables are defined without the STATIC keyword.

	   -They are defined Outside a method declaration. 
	   -They are Object specific and are known as instance variables.

	. Static Variables
	  - static variables are defined with the STATIC keyword
	  - Static variables are initialized only once, at the start of the program execution.
	  - These static variables should be initialized first, before the initialization of any

	 -Data Types in Java?
	 * DATATYPES :>
 * 	=>Data types in Java are defined as specifiers that allocate different sizes and types of values that can be stored in the 
 *    variable or an identifier.
 *    
 *    Ex : int a = 10;
 *         int(data type) a (identifier/variable name) = 10(value);
 *         
 *  |----------------------------------------------|      
 *  | DATA TYPE                       DEFAULT SIZE |
 *  | byte                            1 byte       |
 *  | short			      2 bytes      | 
 *  | int 			      4 bytes      |
 *  | long			      8 bytes      |
 *  | float			      4 bytes      |
 *  | double			      8 bytes      |
 *  | boolean			      1 byte       |
 *  | char   			      2 bytes      |
 *  |----------------------------------------------|


	*/
public class P3_Task01_VariablesAndDatatypesInJava {
	static int q = 11;
	int p = 10;

	public static void main(String[] args) {
		
		//valid declaration
        int a, b, c;
        float pi;
        double d;
        char e;
        
        //valid initialisation
        
        pi=3.14f;
        d= 20.22d;
        e='v';
        
        a=10;
        b=10;
        c=10;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);

        int myNum=5;; //integer(whole no)
        float myFloatNum = 5.99f; // floating point no
        char myLetter = 'D';//character
        boolean myBool = true; // Boolean
        String myText = "Hello"; //String
        
         System.out.println(myNum);
         System.out.println(myFloatNum);
         System.out.println(myLetter);
         System.out.println(myBool);
         System.out.println(myText);
         
         
         double f;
         int i = 10;
         f = i; //TypeConversion
         
         double g = 10;
         int j;
         j = (int) g;//TypeCasting
         
         System.out.println(f);
         System.out.println(i);
         System.out.println(g);
         System.out.println(j);
         
         
         byte k = 10; // 1byte
         boolean l = true; // 1 bit = True or False only
         long m = 10l;
         float n = 1.2f;
         double o = 1.2d;
         
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
         
        System.out.println(ABC.j); // Data + functions/methods
        // ABC.display();
        
        ABC obj1 = new ABC();
        System.out.println(obj1.i++);
        System.out.println(obj1.i);
        
        ABC obj2 = new ABC();
        System.out.println(obj2.i);
        
        
        System.out.println(ABC.j++);
        System.out.println(ABC.j);
        
        ABC.typeconversionAndTypecasting();
        
        
	}
	
	int r = 10;
	
	void display() {
		
		int a = 5; //local variable
		System.out.println(" This Is Display Method!");
		System.out.println(a);
	
	}
}
class ABC {
	static int j = 10;// class variable/static variable
	int i = 10;// Instance variable
	
	static void display() {
		
		int a = 5; //local variable
		System.out.println("This is Display Method!");
		System.out.println(a);
	}
	
	static void typeconversionAndTypecasting()
	{
		
		/*
		 * Double f; //8 bytes = 64 bits/slots int i=10;//4 bytes=32 bits/slots 
		 * f=i; // Type conversion system.outprintln(f);
		 *
		 *double g = 10 ; // 64 int j; //32 j = (int)g;
		 */
		
		double f; //64 slots
		int i = 10; //32 slots
		f = i; //Type Conversion
		System.out.println(f);
		
		double g = 10; //64
		int j; //32
		j = (int)g;//Type Casting
		
		//32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
	}
}
