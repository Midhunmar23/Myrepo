package multipleinheitane;

public class Childclass implements InterfaceA,IntefaceB 
{
	
	

	@Override
	public void empdtals() {
		
		System.out.println("Interface");
		
	}



	@Override
	public void emp() {
		System.out.println("Hai");
		
	}
	
	

	public static void main(String[] args) 
	{
	    
		 Childclass ob= new  Childclass();
		 ob.emp();
		 ob.empdtals();
		 ob.sum();
		 

	}



	@Override
	public void sum() 
	{
		
		System.out.println("sum");
		
		
	}

}
