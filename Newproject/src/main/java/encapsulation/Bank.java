package encapsulation;

public class Bank
{
	
	
	
	private int uniquepin;
	
	public void setpin(int uniquepin)
	{
		this.uniquepin= uniquepin;
	}
	
   
	 public void vlidatepin()
	 {
		 if(uniquepin == 1001)
		 {
			 System.out.println("Cashwithdrow");
			
			 
		 }
		 
		 else if(uniquepin == 1234)
		 {
			 System.out.println("Chage Pin");
		 }
		 
		 else if(uniquepin == 1212)
		 {
			 System.out.println("Balance enquries");
		 }
		 
		 
		 else
		 {
			 System.out.println("Trasation failed");
		 }
		 
		 
		 
		 
		 
	 }
	
	

}
