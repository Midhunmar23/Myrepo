package exceptionhadle;

public class Customexeption {

	public static void main(String[] args) throws Voteexcetion 
	{
		
		int age=15;
		
		if(age>18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			throw new Voteexcetion ("Not eligible");
		}
		
	}

}
