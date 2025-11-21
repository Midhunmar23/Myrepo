package collectionmylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylistitrate {

	public static void main(String[] args) 
	{
		
		ArrayList <String> ob= new ArrayList<String>();
		ob.add("Idian Ocean");
		ob.add("Atladic Ocean");
		ob.add("Baltic Sea");
		ob.add("Bay of Bengal");
		//System.out.println(ob);
		
    ArrayList <String> ob1= new ArrayList<String>();
		ob1.add("Asia");
		ob1.add("Australia");
		ob1.add("Europe");
		ob1.add("America");
		
		//System.out.println(ob1);
		
		//System.out.println(ob.addAll(ob1));
		//System.out.println(ob);
		
		//addall to add elemets from othe list
		
		//Contains all to check list is preasent in othere list
		
		//System.out.println(ob.containsAll(ob1));
		//System.out.println(ob1.containsAll(ob));
		
		//Size off
		//System.out.println(ob.size());
		
		Iterator <String> obm= ob.iterator();
		
		while(obm.hasNext())
		{
			System.out.println(obm.next());
		}
		
		obm.remove();
		System.out.println(ob);
		
		
			
		

	}

}
