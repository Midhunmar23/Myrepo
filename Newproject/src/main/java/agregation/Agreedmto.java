package agregation;

public class Agreedmto
{
	String name;
	String location;
	int distance;
	Agregationdemo ref;
	
	
	public Agreedmto(String name, String location, int distance, Agregationdemo ref)
	{
		this.name=name;
		this.location=location;
		this.distance=distance;
		this.ref=ref;
		
		
		
		
	}
	public void viewagree()
	{
		System.out.println("name: "+ name + "location: "+location+ "disctance: "+distance+ "ref:"+ref.name+ "refhousename: "+ref.housename+"refSSCN:  "+ref.SSCno+ "age: " +ref.age );
	}
	

	public static void main(String[] args) 
	{
		
		 Agregationdemo ob= new  Agregationdemo("Swan","KLM",12514,25);
		Agreedmto obj= new Agreedmto("Miller","KTR",55,ob);
		obj.viewagree();

	}

}
