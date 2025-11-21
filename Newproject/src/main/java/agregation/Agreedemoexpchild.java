package agregation;

public class Agreedemoexpchild 
{
	
	String address;
	int divition;
	 Agreedemoexp ref;
	
	
	 public Agreedemoexpchild (String address, int divition,  Agreedemoexp ref)
	 {
		 this.address=address;
		 this.divition=divition;
		 this.ref=ref;
		 
	 }
	 
	 
	 public void stddetals()
	 {
		 System.out.println("name: "+ref.name+"class :"+ref.cls+ "Roll num: "+ref.rollnum +"address: "+address +"Divition: "+divition);
	 }
	
	

	public static void main(String[] args)
	{
		
		 Agreedemoexp obj1= new  Agreedemoexp ("MJ", 14, 125411);
		 Agreedemoexpchild obj2= new Agreedemoexpchild("One new avenu", 15, obj1);
		 
		 obj2.stddetals();
		
	}

}
