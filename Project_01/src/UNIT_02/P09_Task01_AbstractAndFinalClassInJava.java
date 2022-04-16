package UNIT_02;

/*
	Abstract class:
		-	an abstract class must be declared with an abstract keyword
		-	abstraction is a process of hiding the implementation details and showing only functionality(function declarations) to the user
		-	can not make object of abstract class directly,but through derived class with the help of which we can access members of the abstract class by creating its object
	-	abstract class may contain abstract and non-abstract methods
	-	(0-100%)abstract methods can be there
	
	-	in case of interface:	100% abstract class
	

Final class:
	-	the main purpose of using a class being declared as final is to prevent the class from being inherited by any other class
	-	if a class is marked as final then no class can inherit any feature from the final class
	-	you cannot extend a final class.If you try it gives you a compile time error   
*/

abstract class Bike{
int a;

Bike(){
	System.out.println("inside bike constructor : "+ a +"\n" );
}
abstract void run();//abstract method (0-100%)

void display()
{
	System.out.println("this is display method");
}
}

class Honda4 extends Bike{
void run()
{
	System.out.println("honda4 class");
}
}
public class P09_Task01_AbstractAndFinalClassInJava {

public static void main(String[] args)
{
	Bike obj = new Honda4();
	obj.run();
	obj.display();
	
	//can not be instantiated
	//Bike obj2 = new Bike();
	
}
}

final class Super{
public int data =30;

void display() {
	System.out.println(data);
}
}

/*
public class Sub extends Super{
void display2(){
	display();	
}
}
*/