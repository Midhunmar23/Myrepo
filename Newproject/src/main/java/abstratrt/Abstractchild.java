package abstratrt;

public class Abstractchild  extends Abstractmeth 
{
	
	@Override
	public void emp() 
	{
		System.out.println("My abstract One");
		
	}
	
	public void math(int m, int n)
	{
		int sum= m*n;
		
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) 
	{
		
		Abstractmeth  obi= new Abstractchild();
		obi.emp();
		obi.view(5, 6);
		
		Abstractchild obj= new Abstractchild();
		obj.math(5, 8);
		
		
		

	}

	
	
	

}
