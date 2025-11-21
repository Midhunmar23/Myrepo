package agregation;

public class Agrrereftwo 
{
	
	private String classnumber;
	private  Agrrerefone ref;
	
	public Agrrereftwo(String classnumber, Agrrerefone ref)
	{
		this.classnumber=classnumber;
		this.ref=ref;
	}
	
	public void stddtals()
	{
		System.out.println("Classname:"+ classnumber );
		
		System.out.println("ref:"+ ref.name+ "Address:"+ref.address);
	}

	public static void main(String[] args) 
	{
		 Agrrerefone obj=new  Agrrerefone("MK", "Agm");
		 Agrrereftwo ob=new Agrrereftwo ("MNV",obj);
		 ob.stddtals();
	
	}

}
