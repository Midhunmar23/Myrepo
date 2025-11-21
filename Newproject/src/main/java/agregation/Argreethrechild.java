package agregation;

public class Argreethrechild
{
	
	int contactdetails;
	Argreethre ref;
	
	
	public Argreethrechild (int contactdetails, Argreethre ref)
	{
		this.contactdetails=contactdetails;
		this.ref=ref;
		
	}
	
	
	public void detials()
	{
		System.out.println("output: "+contactdetails+ "Reffrenc: " + "Name:" +ref.name  + "Id: "+ ref.id );
	}
	
	
	

	public static void main(String[] args)
	{
		
		
		Argreethre ob= new Argreethre("MK","MJHG");
		Argreethrechild obj= new Argreethrechild(1254, ob);
		obj.detials();
		

	}

}
