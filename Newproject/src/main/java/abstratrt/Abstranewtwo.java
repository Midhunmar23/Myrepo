package abstratrt;

public class Abstranewtwo extends Abtranew
{
	
	

	@Override
	public void Emp() {
		
		super.Emp();
	}

	@Override
	public void sp() 
	{
		
		System.out.println("Child class");
		
		
	}

	public static void main(String[] args)
	{
		Abstranewtwo obj = new Abstranewtwo();
		obj.Emp();
		obj.sp();
	

	}

}
