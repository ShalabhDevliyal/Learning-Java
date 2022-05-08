package Assignment_01;


import java.util.Scanner;
/*
Q2- WAP to count the total number of calls for a member function from
	more than one objects. [Let’s say, from 3 such Objects]
 */
public class Q2 {

	public static void main(String[] args) {
		int n=5;		
		St arr[]=new St[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new St();
		}
		arr[0].add();
		arr[1].add();
		arr[2].add();
		System.out.println("total no of method calls= "+ St.count);
	}

}

class St
{
	static int count=0;
	int a,b;
	
	St()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a and b= ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println();
	}
	void add()
	{
		System.out.println("sum="+a+b);
		count++;
	}
}