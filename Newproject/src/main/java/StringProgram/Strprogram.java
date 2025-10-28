package StringProgram;

public class Strprogram {

	public static void main(String[] args) 
	{
		
		 String Name="MG";
		 
		  System.out.println(Name);
		  
		  String LName= new String("  Kumar");
		  
		  System.out.println(LName);
		
		  //length retun the length of the string
		  
		  System.out.println(Name.length());
		  //concatination adding to string
		  System.out.println(Name.concat(LName));
		  System.out.println(Name);
		  //charAt- to return the charater of the string
		  System.out.println(Name.charAt(1));
		  //Contains to check wheter a chrater or word present it retuan ture or flase
		  String Wordleg="Hai to day is Friday";
		  System.out.println(Wordleg.contains("Friday"));
		  System.out.println(Wordleg.contains("Saterday"));
		  
		  String Jv="java";
		  String Jm="java";
		  String m="Java";
		  String j= "Selenium";
		  String n="";
		  int a=15;
		  System.out.println(Jv.equals(Jm));
		  System.out.println(m.equals(Jm));
		  System.out.println(m.equals(j));
		  //equal ignor case
		  System.out.println(Jv.equalsIgnoreCase(m));
		  //To upper case- to conver a letter to upper case
		  System.out.println(Jv.toUpperCase());
		  //To lower case
		  System.out.println(m.toLowerCase());
		  //is empty to check wheater the case is empty or not 
		  System.out.println(m.isEmpty());
		  System.out.println(n.isEmpty());
		  //Valueof- conver data type to string
		  System.out.println(String.valueOf(a));
		  
		  String Lastname="Kumar MG";
		  String Midname="Kumar MG";
		  String fristname= new String("Kumar MG");
		  System.out.println(Lastname==Midname);
		  System.out.println(Lastname.equals(Midname));
		  System.out.println(Lastname==fristname);
		  System.out.println(Lastname.equals(fristname));
		  
		  //Equal operator is used to compare object refferncess, meaning it checks the if 2 variables point to the same memery location on the other had .equal methered is used to 
		  //compare the vale of objects 
		  
		  		  
		  
	}

}
