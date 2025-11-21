package multipleinheitane;

public class Democlass implements Intefacedeomone, Interfacedemotwo
{
	
	
	

	@Override
	public void sum()
	{
		System.out.println("a, b");
		
		
	}

	@Override
	public void add() 
	{
		System.out.println("Sum");
		
	}

	public static void main(String[] args) 
	{
		
		 Democlass ob= new  Democlass();
		 ob.add();
		 ob.sum();
		 Intefacedeomone.view();
		 ob.empview();
		 
		 
		
		
	}

}
