package accressmodtwo;

import accressspecifier.Mainaccessspecifer;

public class Accreespecifier extends Mainaccessspecifer
{

	public static void main(String[] args) 
	{
		
		Accreespecifier obj= new Accreespecifier();
		obj.classdisplay();
		obj.protecdisplay();
		
		Mainaccessspecifer obl= new Mainaccessspecifer();
		obl.classdisplay(); // only public class will be there if you create a inherit from parent class
		
				
	}

}
