package polymor;

public class Checkdiv extends Addition
{
	
	public Checkdiv(int a, int b)
	{
		int sum= super.Addition(a, b);
		
		System.out.println("Sum" + a + " and " + b + " is: " + sum);
		
		if (sum % 10==0)
		{
			System.out.println("The sum is divicible by 10");
		}
		
		else
		{
			System.out.println("Not divicible by 10");
		}
	}
	

	public static void main(String[] args) 
	{
		
		
		Checkdiv ob= new Checkdiv (15, 7);
		
		
		

	}

}
