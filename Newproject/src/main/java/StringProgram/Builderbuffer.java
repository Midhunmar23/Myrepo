package StringProgram;

public class Builderbuffer {

	public static void main(String[] args) {
		
		
		StringBuffer s1= new StringBuffer("Krishna");
		StringBuilder m1=new StringBuilder("Arjun");
		System.out.println(s1);
		System.out.println(m1);
		
		//insert() to insert a new value to the index position
		System.out.println(s1.insert(4, "One"));
		System.out.println(s1);
		//append(); add the new string at the last
		System.out.println(s1.append("Karan"));
		//Replace Can replace one sting to another starting from the index position
		System.out.println(m1.replace(1, 3, "Ka"));
		System.out.println(s1.replace(5, 6, "Ishna"));
		//Delete to delete the charater
		System.out.println(s1.delete(5, 8));
		//reverse string to reverse a string
		System.out.println(m1.reverse());
		
		
		
		
		
		
	}

}
