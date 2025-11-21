package agregation;

public class Address 
{
	
	String address;
	Student ref;
	
	public Address (String address, Student ref)
	{
		this.address=address;
		this.ref=ref;
		
	}
	
	public void Stddetals() 
	{
		System.out.println("Student name:"+ ref.studentname+ "Roll number: "+ ref.rollnumber+ " address:"+ address);
	}

	public static void main(String[] args) 
	{
		
		Student ob= new Student("Aldrin",215471);
		
		Address obj= new Address("Oclahoma",ob);
		obj.Stddetals();
		
		
		

	}

}
