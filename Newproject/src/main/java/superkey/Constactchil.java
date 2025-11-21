package superkey;

public class Constactchil extends Constarctparnet
{
	
	      public Constactchil()
	      {
	    	  
	    	 // super();
	    	  System.out.println("Child Non parametrised");
	      }
	      
	      public Constactchil(int a)
	      {
	    	  super(3);
	    	  System.out.println(a);
	      }
	      
	      public static void main (String args[]) 
	      {
	    	  Constactchil ob= new Constactchil();
	    	 // Constarctparnet ob1= new Constarctparnet();
	    	  Constactchil   ob2= new Constactchil(5);
	    	  
	    	  
	      }

}
