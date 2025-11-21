package abstratrt;

public class Absrtamain extends Abtra
{
	
	@Override
	public void view() 
	{
		
		System.out.println("My Abstract");
	}

	@Override
	public int add() 
	{
		int a=3;
		int b= 5;
		
		int sum=a+b;
		
		return sum;
	}
	public static void main(String[] args) 
	{
		Absrtamain obj= new Absrtamain();
		obj.view();
		
		System.out.println(obj.add());
		obj.viemeth();
		
		
		
        
	}

}
