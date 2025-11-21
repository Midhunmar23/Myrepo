package collectionmylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrlist {

	public static void main(String[] args) 
	{
		ArrayList <String> arry= new ArrayList<String>();
		
		arry.add("Map");
		arry.add("Calender");
		arry.add("Compaus");
		arry.add("Jerrycan");
		System.out.println(arry);
		
		ArrayList<String> arrya= new ArrayList<String>();
		
		arrya.add("Food");
		arrya.add("Tent");
		arrya.add("Tripode");
		arrya.add("Mechanical Kit");
		
		System.out.println(arrya);
		
		for(String arr : arrya)
		{
			//System.out.println(arr);
		}
		
		System.out.println(arry.containsAll(arrya));
		System.out.println(arry.addAll(arrya));
		System.out.println(arry);
		
		
		Iterator <String> obm= arry.iterator();
		
		while(obm.hasNext())
		{
			System.out.println(obm.next());
		}
		obm.remove();
		System.out.println(arry);
		
		
		

	}

}
