package abstratrt;

public class Abtraonechild extends Abtraone
{

	public static void main(String[] args) 
	{
		Abtraone obj= new Abtraonechild();
		obj.empdetails();
		obj.emv();
		

	}

	@Override
	public void empdetails() 
	{
		
		System.out.println("Abtract");
	
		
	}

}
