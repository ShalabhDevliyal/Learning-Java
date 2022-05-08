package Assignment_01;

/*
Q9. WAP in java, which would demonstrate access protection over a
	class and a variable of that class.	
	Note: class can be public and default while variable can be default,
	private, protected, and public.
	(If required then do create more than 2 packages)
 */
public class Q9 {

	public static void main(String[] args) {
		 Access obj=new Access();
	     System.out.println(obj.a+" "+obj.b+" "+obj.c);
//	     System.out.println(obj.d); we cannot access private access protection outside the class Acess
	     obj.display();
	}

}
class Access
{
	int a=1;
	public int b=2;
	protected int c=3;
	private int d=4;
	void display()
	{
		System.out.println(a+" "+b+" "+c+" "+d);//we can access all (default,public,protected,private) inside same class 
	}
}