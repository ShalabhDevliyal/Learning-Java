package Assignment_01;

import java.util.Scanner;
/*
Q3- Given an interface in1 which includes a method display which takes
	an integer as input .
	interface In1
	{
	void display(int p);
	}
	Task is to write a class testClass which implements interface In1 and has
	a method named display which takes an integer as an input p and the
	display method should be able to tell if the number is prime or not?
	- The main method should not be in testClass, create a separate class for
	that.
 */
public class Q3 {

	public static void main(String[] args) {
		int p;
		System.out.print("enter a no:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		TestClass obj=new TestClass();
		obj.display(p);
	}

}

interface In1
{
	void display(int p);
}
class TestClass implements In1
{
	public void display(int p)
	{
		if(p==0 || p==1) {
			System.out.println("Not prime");
			return;
		}
			
		for(int i=2;i<=p/2;i++)
		{
			if(p%i==0)
			{
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime Number");
	}
	
}