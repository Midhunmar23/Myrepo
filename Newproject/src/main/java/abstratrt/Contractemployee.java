package abstratrt;

public class Contractemployee  extends Abstractassinment 
{
	
	int workinghrs;
	
	
	public Contractemployee(String name, double paymentperhours, int workinghrs)
	{
		super(name, paymentperhours);
		this.workinghrs=workinghrs;
	}

	@Override
	public double calculateSalary() {
		
		return paymentperhours*8;
	}
	
	

}
