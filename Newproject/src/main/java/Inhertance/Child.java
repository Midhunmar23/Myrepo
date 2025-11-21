package Inhertance;

public class Child extends Parentclass
{
	
	public void div()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		
		Child obj= new Child();
	    obj.add();
	    obj.div();
	    
	    //we cant call parent class propery in child calss object
	}

}
