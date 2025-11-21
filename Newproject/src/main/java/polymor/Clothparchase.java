package polymor;

public class Clothparchase extends Offseason 
{

	public static void main(String[] args)
	{
		
		double itemprice= 100.00;
		
		Onseasaon onses= new Onseasaon();
		  double onSeasonFinalPrice =  onses.discount(itemprice);
		  System.out.println("Orginal Price: "+itemprice);
		  System.out.println("Onseasaon Discount price "+ onSeasonFinalPrice);
		  System.out.println();
		  
		  Offseason offses= new Offseason ();
		  
		  double offseasonfinalprice= offses.discount(itemprice);
		  System.out.println("Orginalprice "+ itemprice);
		  System.out.println("Offseason Discount price "+ offseasonfinalprice);

	}

}
