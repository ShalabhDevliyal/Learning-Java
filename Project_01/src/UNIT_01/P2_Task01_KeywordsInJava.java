/*
 * 
Keywords are reserved words that your are not supposed to use in the program as they have predefined meaning.

Method

Variables

Objects

50 keywords are there in Java where 48 are used and 2 are for future use.

goto*[future]

const*[future]

Versions of Java => 1.2v,1.4v,5.0v

not used => *    [goto* , const*]

1.2v     => **   [assert**]

1.4v     => ***  [sctrictfp***]

5.0v     => **** [enum****]
*/


package UNIT_01;

public class P2_Task01_KeywordsInJava {
	public static void main(String[] args) {
		/*
		 	*50 keywords
		 	*reserved words (meanings are already defined by the compiler)
		 	*we are not supposed to use keywords as:
		 		*method name
		 		*variables
		 		*objects 
		*/
		void int() { //keywords can not be used as method name 
			System.out.println("hello");
		}
		
		int int=124; //keywords can not be used as variable name
		
		abc int=new abc();//keywords can not be used as object name 
		int.a=10;
		System.out.println(int.a);
	}
}
class int //keywords can not be used as class name
{
	int a;
}
class abc
{
	int a;
}