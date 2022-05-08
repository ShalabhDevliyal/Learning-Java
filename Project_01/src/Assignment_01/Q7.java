package Assignment_01;

/*
Q7. WAP to count the total number of calls for a member function:
	display(), from more than one objects and how many times the object is
	created of a class name Employee.
	Note: Call display() function from more than 3 objects
 */
public class Q7 {

	public static void main(String[] args) {
		ClassCount obj1=new ClassCount();
		ClassCount obj2=new ClassCount();
		ClassCount obj3=new ClassCount();
		obj1.display();
		obj2.display();
		obj2.display();
		obj3.display();
		obj3.display();
		System.out.println("member function call= "+ClassCount.count_m+"\ntotal objects= "+ClassCount.count_o);
	}

}

class ClassCount
{
	static int  count_m=0,count_o=0;
	ClassCount()
	{
		count_o++;
	}
	void display()
	{
		count_m++;
	}
	
}