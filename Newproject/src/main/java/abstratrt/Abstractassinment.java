package abstratrt;

public abstract class Abstractassinment 
{
	
	 String name;
	 double paymentperhours;
	 
	 public Abstractassinment(String name, double paymentperhours)
	 {
		 this.name=name;
		 this.paymentperhours=paymentperhours;
		 
	 }
	 
	 public  abstract double calculateSalary();

}
