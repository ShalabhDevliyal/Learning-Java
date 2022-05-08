package Assignment_01;

/*
Q10. WAP in Java Program To Survey Four Different Car Models For Four
	Different Cities
	Your job is to find out the total number of cars sold of each model in all
	the cities. Use Array of objects or multiple objects of class name City.
 */
public class Q_10 {

	public static void main(String[] args) {

		city Delhi=new Car(100,230,350,480);
		city Mumbai=new Car(110,210,130,410);
		city Chennai=new Car(130,220,320,240);
		city Kolkata=new Car(140,260,8300,400);
		int m=Delhi.maruti+Mumbai.maruti+Chennai.maruti+Kolkata.maruti;
		int z=Delhi.zen+Mumbai.zen+Chennai.zen+Kolkata.zen;
		int w=Delhi.wagnor+Mumbai.wagnor+Chennai.wagnor+Kolkata.wagnor;
		int s=Delhi.sx+Mumbai.sx+Chennai.sx+Kolkata.sx;
		System.out.println("Maruti: "+m);
		System.out.println("Zen :"+z);
		System.out.println("Wagnor: "+w);
		System.out.println("Sx: "+s);
	}

}

class Car
{
	int maruti;
	int zen;
	int wagnor;
	int sx;
	
	Car(int maruti,int zen,int wagnor,int sx)
	{
		this.maruti=maruti;
		this.zen=zen;
		this.wagnor=wagnor;
		this.sx=sx;
	}
	
}