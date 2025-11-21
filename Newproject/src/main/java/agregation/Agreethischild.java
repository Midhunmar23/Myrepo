package agregation;


public class Agreethischild 
{
	
	int batchnumber;
	Agreethisparent ref;
	
	public Agreethischild (int batchnumber, Agreethisparent  ref)
	{
		this.batchnumber=batchnumber;
		this.ref=ref;
		
	}
	
	public void stddisplay() 
	{
		System.out.println("batchnumber:" +batchnumber+ "ref name:"+ref.name+"ref accnumber:");
		
	}

	

	public static void main(String[] args) 
	{

		Agreethisparent ob=new Agreethisparent("Mk", 12541, 52417);
		
		Agreethischild obj=new Agreethischild(125474,ob);
		obj.stddisplay();

	}

}
