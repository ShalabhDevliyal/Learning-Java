package UNIT_02;

//Interface - 100% abstract class.
interface Animal{
	public void animalsound();             // Interface method does not have a body.
	public void run();
}

interface Human{
	
	public void humansound();
	public void run1();
	
}

public class P12_Task01_InterfaceInJava implements Animal {
	public static void main(String[] args) {
		
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		
	}
	
	public void animalsound() {}
	
	public void run() {}
	
}

class Species implements Animal, Human{
	
	public void animalsound() {
		
		System.out.println("We are inside animalsound");
		
	}
	
	public void run() {
		
		System.out.println("We are inside run method");
		
	}
	
	public void humansound() {
		
		System.out.println("We are inside humansound");
		
	}
	
	public void run1() {
		
		System.out.println("We are inside run method");
	
	}
	
}

interface A1 {
	
	void funcA();
	
}

interface B1 extends A1 {
	
	void funcB();
	
}

class C1 implements B1{
	
	public void funcA() {
		
		System.out.println("This is funcA from A1");
	
	}
	
	public void funcB() {
		
		System.out.println("This is funcB from A2");
		
	}
	
}