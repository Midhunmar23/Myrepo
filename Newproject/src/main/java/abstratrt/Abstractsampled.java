package abstratrt;

public class Abstractsampled extends Apstrasample 
{
	
	
	public Abstractsampled()
	{
		super(25);
	}
	

	@Override
	public void empdetals() {
		
		System.out.println("Hello");
		
	}
	
	public void viewemp()
	{
		System.out.println("abstract");
	}

	public static void main(String[] args)
	{
		
		 Apstrasample obj=new Abstractsampled ();
		 obj.empdetals();
		 obj.add(5, 8);
		 
		 Abstractsampled ob=new Abstractsampled();
		 ob.viewemp();
		 

	}

}
