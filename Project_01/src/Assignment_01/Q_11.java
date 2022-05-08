package Assignment_01;
import java.util.Scanner; 
/*
Q6. As given there are two sample methods: First one returns the sum of
	two numbers a and b and second one returns the subtraction of a and b. if
	a-b is negative then return value would be 0. Use ternary operator to call
	these two methods. If a>b then ternary should call sum(a,b) but if a<b
	then ternary operator should call sub(a,b). Eventually print the result of
	the ternary operation on variable a and b.
	Note: Ternary operator can call a method even for true and false values
 */
public class Q_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a,b;
		System.out.print("Enter value of a: ");
		a=sc.nextInt();
		System.out.print("Enter value of b: ");
		b=sc.nextInt();
		
		Operation2 obj=new Operation2();
		int c=(a>b)?obj.sum(a, b):obj.sub(a, b);
		System.out.println(c);
	}

}

class Operation2
{
	int sum(int a, int b)
	{
		return a+b;
	}
	
	int sub(int a, int b)
	{
		return b-a;
	}
}