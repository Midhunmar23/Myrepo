package agregation;

public class Agreetwo {
	
	
	String name;
	int acctnumber;
	Agreeone ref;   //ref from parent class
	
	
	 public Agreetwo (String name, int acctnumber, Agreeone ref )
	 {
		 this.name=name;
		 this.acctnumber=acctnumber;
		 this.ref=ref;
		 
	 }
	 
	 public void userdetails()
	 {
		 System.out.println("name: "+name);
		 System.out.println("acctnumber: "+ acctnumber);
		 
		 System.out.println(ref.name + " "+ ref.acctnumber);
	 }
	
	

	public static void main(String[] args)
	{
		
		Agreeone obj= new Agreeone("MJ", 857478); //parent class object
		Agreetwo ob= new Agreetwo("MH", 98956458,obj);
		ob.userdetails();
		
		

	}

}
