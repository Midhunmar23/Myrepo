package abstratrt;

public class Childabstract extends Pranabstract
{
	
	public Childabstract()
	{
		super(18);
		
		System.out.println("Child Constact");
	}
	
	public void empview()
	{
		System.out.println("YA"); //canot create object while using parent class object
	}
	
	

	@Override
	public void myview() {
		
		System.out.println("Hai");
		
	}

	public static void main(String[] args) 
	{
		Pranabstract obj= new  Childabstract();
		obj.myview();
		obj.mymethord();
		//Childabstract obj1 = new Childabstract();
		//obj1.empview();		
				
		
		

	}

}
