package Assignment_01;

import java.util.Scanner;

/*
5Q. WAP in Java which would contain 8 objects of a Class Employee.
	Employee contains name, age, department, salary. Your program would
	be able to calculate the total salary to be paid in each department. Use
	constructors to create these 8 objects and Scanner to take inputs.
	Restrictions:
	1- Minimum 8 objects [can be created manually with parameterized
	constructors with Scanner input]
	2- Departments are, A, B, C, D: minimum 4 departments [String Type]
	3- If the Salary exceeds more than 30,000, then the default salary
	would be 25000 of any of the employee
	4- Use array of objects, instead of using multiple 8 objects separately
	Use:
	Employee arr[] = new Employee[8];
	And arr[i].department.equals("A");
 */
public class Q5 {

	public static void main(String[] args) {
		String name;
		int age;
		String department;
		int salary;
		Scanner sc=new Scanner(System.in);
		 
		Employee arr[]=new Employee[8];
		for(int i=0;i<8;i++)
		{
			System.out.print("Enter name:");
			name=sc.nextLine();
	
			System.out.print("Enter age:");
			age=sc.nextInt();
			sc.nextLine();
	
			System.out.print("Enter department:");
			department=sc.next();
			
			System.out.print("Enter salary:");
			salary=sc.nextInt();
			sc.nextLine();
			
			System.out.println("");	
			arr[i]=new Employee(name,age,department,salary);
		}
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int i=0;i<8;i++)
		{
			if(arr[i].department.equals("A"))
			{
				if(arr[i].salary>30000)
					a+=25000;
			    else
			    	a+=arr[i].salary;
			}
			else if(arr[i].department.equals("B"))
			{
				if(arr[i].salary>30000)
					b+=25000;
				else
					b+=arr[i].salary;
			}
			else if(arr[i].department.equals("C"))
			{
				if(arr[i].salary>30000)
					c+=25000;
				else
					c+=arr[i].salary;
			}
			else if(arr[i].department.equals("D"))
			{	
				if(arr[i].salary>30000)
					d+=25000;
				else
					d+=arr[i].salary;
		    }
		}
   
		System.out.println("salary of department A:"+a+"\nsalary of department B:"+b+"\nsalary of department C:"+c+"\nsalary of department D:"+d);
		
	}

}

class Employee
{
  
	String name;
	int age;
	String department;
	int salary;
	
	Employee(String name,int age,String department,int salary)
	{
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary=salary;
	}
	
}