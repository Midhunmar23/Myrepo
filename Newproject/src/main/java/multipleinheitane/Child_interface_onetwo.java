package multipleinheitane;

public class Child_interface_onetwo implements Intefaceone, Interfacetwo
{

	@Override
	public void view() 
	{
		
		System.out.println("Interface abstract");
	}
	
	
	
	public static void main(String args [])
	{
		
		Child_interface_onetwo obj= new Child_interface_onetwo();
		obj.view();
		
		Interfacetwo.empdetals();
	 
	}
	
	

}
