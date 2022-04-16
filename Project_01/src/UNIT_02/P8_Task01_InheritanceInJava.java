package UNIT_02;
/*
-	extends keyword

-	subclass
-	supper class
-	code re-usability
 
class derived-class-name "extends" base-class
{	
	methods and fields
}

Type of inheritance:
	-	single inheritance
	-	multilevel inheritance
	-	multiple inheritance:	- java does not supports multiple inheritance with classes
								- it handles this feature by implementing more than one interface instead of extending more than one class
	-	hierarchical inheritance
	-	hybrid inheritance:		- java does not supports multiple inheritance
							
-	Constructor calls flow in inheritance:
	-	default constructor
	-	parameterized constructor
	
*/
public class P8_Task01_InheritanceInJava {
	
	public static void main(String[] args)
	{
		Three g=new Three();
		g.methodOne();
		g.methodTwo();
		g.methodOne();
		g.methodThree();
		
//		Two two=new Two();
		D obj=new D(2);
		obj.methodFour();
	}
}

class One{
	int a;
	
	One(int x){
		System.out.println("one constructor");
	}
	
	void methodOne()
	{
		System.out.println("FirstMethod");
	}
}

class Two extends One{
	int b;
	
	Two(int x)
	{
		super(3);
		b=x;
		System.out.println("Two");
	}
	
	void methodTwo()
	{
		System.out.println("SecondMethod");
	}
}

class Three extends Two{
	int c;
	
	Three()
	{
		super(1);
		System.out.println("Three constructor");
	}
	
	Three(int x)
	{
		super(1);
		c=x;
		System.out.println("Three");
	}
	
	void methodThree()
	{
		System.out.println("ThirdMethod");
	}
}

class A{
	 int a;
	 
	 A(int a1)
	 {
		 a=a1;
	 }
	 
	 void methodOne()
	 {
		 System.out.println(a);
	 }
}

class B extends A{
	int b;
	
	B(int x)
	{
		super(10);
		b=x;
	}
	
	void methodTwo()
	{
		System.out.println(b);
	}
}

class C extends A{
	int c;
	
	C()
	{
		super(10);
		c=10;
	}
	
	void methodThree()
	{
		System.out.println(c);
	}
}

class D extends A{
	int d;
	
	D(int d1)
	{
		super(d1);
		d=d1;
	}
	
	void methodFour()
	{
		System.out.println(d);
	}
}