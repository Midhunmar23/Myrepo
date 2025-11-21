package superkey;

public class Childsupermethord  extends Parrentsupermethord 
{
	public void view()
	{
		System.out.println("Chil Methord");
		super.display();
		super.detals(5, 6);
		this.dtail();
	}
	
	public void dtail()
	{
		System.out.println("Hai World");
	}

	public static void main(String[] args) 
	{
		Childsupermethord ob= new Childsupermethord ();
		//ob.display();
		ob.view();
		
	}

}
