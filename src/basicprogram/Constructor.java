package basicprogram;

public class Constructor {

	Constructor()
	{
		System.out.println("Constructor");
	}
	Constructor(String b, int f)
	{
		System.out.println("My values");    
	}
	 
	public static void main(String[] args)
	{  
		new Constructor("sham", 34);
		
		new Constructor();
	}

}
