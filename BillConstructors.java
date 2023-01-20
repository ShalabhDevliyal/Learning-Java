package practical;
import java.util.Scanner;
import java.io.*;

class Telcall{
	String phno;
	String sname;
	int n;
	double amt=0;
	
	Telcall(String phno,String sname,int n)
	{
		this.phno=phno;
		this.sname=sname;
		this.n=n;
	}
	void Compute()
	{
		if(1<n && n<=100)
		{
			amt=500;
		}
		else if(100<n && n<=200)
		{
			amt=1.0*(n-100)+500;
		}
		else if(200<n && n<=300)
		{
			amt=(n-200)*1.20+100+500;
		}
		else
		{
			amt=(n-300)*1.50+120+100+500;
		}
	}
	void display()
	{
		System.out.println("Subscriber Name : " +sname);
		System.out.println("Phone number : " +phno);
		System.out.println("Number of Calls Made : " +n);
		System.out.println("Bill Amount : " +amt);
	}
	
}
public class Test{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter phone number : ");
		String phno=sc.nextLine();
		System.out.print("Enter Subscriber Name : ");
		String sname=sc.nextLine();
		System.out.print("Enter numbers of Calls made : ");
		int n=sc.nextInt();
		
		Telcall T=new Telcall(phno,sname,n);
		T.Compute();
		T.display();
		
		sc.close();
		
	}
	
}
