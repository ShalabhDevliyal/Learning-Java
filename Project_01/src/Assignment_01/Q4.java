package Assignment_01;

/*
Q4. Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
	ClassThree classes.
	ClassOne contains one, single parameterized constructor
	ClassTwo contains only a default constructor
	ClassThree contains one, single parameterized constructor and a default
	constructor.
	Create an object of top child class and make sure the constructor
	execution will take place according to respective multi-level inheritance
	hierarchy.
	ClassThree obj = new ClassThree(1);
	ClassThree obj = new ClassThree();
 */
public class Q4 {

	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);
		System.out.println();
		ClassThree obj2 = new ClassThree();	
	}

}

class ClassOne
{
	ClassOne(int n)
	{
		System.out.println("Inside ClassOne");	
	}	
}
class ClassTwo extends ClassOne
{
	
	ClassTwo()
	{
		super(1);
		System.out.println("Inside ClassTwo");
	}
	
}
class ClassThree extends ClassTwo
{
	ClassThree()
	{
		System.out.println("Inside ClassThree");
	}
	ClassThree(int x)
	{
		System.out.println("Inside ClassThree parameterized constructor");
	}
}