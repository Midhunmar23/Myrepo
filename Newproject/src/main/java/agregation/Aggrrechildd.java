package agregation;

public class Aggrrechildd {
	
	
	String vechilenumber;
	
	Agrreoned ref;
	
	
	   public Aggrrechildd(String vechilenumber, Agrreoned ref)
	   {
		   this.vechilenumber=vechilenumber;
		   
		   this.ref=ref;
	   }
	
	   
	     public void vehicledtails()
	     {
	    	 System.out.println("Vechilename: "+vechilenumber+ "ref name: "+ref);
	     }
	

	public static void main(String[] args) 
	{
		
		
		Agrreoned obj=new Agrreoned("Car", "THCD125");
		
		Aggrrechildd ob= new Aggrrechildd("NHGG12", obj);
		ob.vehicledtails();

	}

}
