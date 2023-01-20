package practical;
import java.util.Scanner;

interface Card
{
	String validate(char card[]); //validation
}
class MasterCard implements Card{
	public String validate(char card[])
	{
		if(card.length == 16)
		{
			if(card[0] == '5' && (card[1] >=1 && card[5] <= '5'))
			{
				return "The card is a MasterCard";
			}
		}
		return "The Card is not a MasterCard";
	}
}

class Visa implements Card {
	public String validate(char card[])
	{
		if(card.length ==13 || card.length ==16)
		{
			if(card[0] == '4')
			{
				return "The card is a Visa Card";
			}
		}
		return "The card is not a Visa Card";
	}
	
	
}

class AmericanExpress implements Card {
	public String validate(char card[])
	{
		if(card.length == 15)
		{
			if(card[0]=='3' && card[1]=='4' || card[0]=='3' && card[1]=='7')
			{
				return "The card is an AmericanExpress";
			}
		}
		return "The card is not an AmericanExpress";
	}
}

public class Cards {

	public static void main(String[] args) {
      
      MasterCard M=new MasterCard();
      Visa V=new Visa();
      AmericanExpress A=new AmericanExpress();
      
      System.out.print("Enter the Card Number : ");
      Scanner sc=new Scanner(System.in);
      String card=sc.nextLine();
      
      Card C;
      C=M;
      System.out.println( C.validate(card.toCharArray()));
      C=V;
      System.out.println(C.validate(card.toCharArray()));
      C=A;
      System.out.println(C.validate(card.toCharArray()));
     
	}

}
