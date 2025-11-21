package agregation;

public class Agreeexpchild
{
	
	String address;
	int contactnumber;
	Agreeexp ref;
	
	public Agreeexpchild(String address, int contactnumber,Agreeexp ref)
	{
		this.address=address;
		this.contactnumber=contactnumber;
		this.ref=ref;	
	}
	
	
	public void viewemp()
	{
		System.out.println("name:"+ref.name+ "accountnum: "+ref.accountnum+ "address:"+address+"contactnumber: "+contactnumber);
	}
	
		
	

	public static void main(String[] args)
	{
		
		Agreeexp obj=new Agreeexp("Mk", "One");
		
		Agreeexpchild obj1= new Agreeexpchild("MJ",58574574,obj);
		obj1.viewemp();
		
		
	}

}
