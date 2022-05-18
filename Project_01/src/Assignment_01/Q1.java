package Assignment_01;
import java.util.Scanner;
/*
Q1- WAP which would contain 6 objects, of a class
	Student. Student [Name, Age, section, percentage]. They all belong to
	Section-A. Your program would be able to find the average percentage of
	students in this section. Use constructors to create these 6 objects and
	input from Scanner class.
 */
public class Q1{

	public static void main(String[] args) {
		Solution arr[]=new Solution[6];
		for(int i=0;i<6;i++)
		{
			arr[i]=new Solution();
		}
		float avg=0;
		for(int i=0;i<6;i++)
		{
			avg+=arr[i].percentage;
		}
		avg/=6;
		System.out.println("average percentage= "+avg);
		
	}

}

class Student{
	String name;
	int age;
	static char section='A';
	float percentage;
	
	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();

		System.out.print("Enter age:");
		age=sc.nextInt();

		System.out.print("Enter percentage:");
		percentage=sc.nextFloat();
		
		System.out.println("");
	}
}