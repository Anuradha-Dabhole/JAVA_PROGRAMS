package basicprogram;

public class Constructor {

	Constructor()
	{
		System.out.println("Constructor");
	}
	Constructor(String b, int f)
	{
		System.out.println("My values:" +b);    
		System.out.println("My values:" +f);    

	}
	 
	public static void main(String[] args)
	{  
		new Constructor();
		Constructor d1 =new Constructor("sham", 34);
		
		
		
	}

}
