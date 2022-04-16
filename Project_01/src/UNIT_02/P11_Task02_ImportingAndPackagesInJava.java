package UNIT_02;

// Inside this package, we can create many classes.

import static java.lang.System.*;
import static java.lang.Math.*;

import UNIT_01.P3_Task01_VariablesAndDatatypesInJava;

public class P11_Task02_ImportingAndPackagesInJava {
	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		
		out.println(sqrt(4));               // Use of "out"
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
		
		P3_Task01_VariablesAndDatatypesInJava obj = new P3_Task01_VariablesAndDatatypesInJava();

	}
}