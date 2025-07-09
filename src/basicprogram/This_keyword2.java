package basicprogram;

public class This_keyword2 
{
	This_keyword2 ()
	{
		this(10);
		System.out.println("1st");
	}
	This_keyword2 (int a)
	{
		this(10,20);
		System.out.println("2nd");
	}
	This_keyword2 (int a,int b)
	{
		this(10,"Arati");
		System.out.println("3rd");
	
	}
	This_keyword2 (int a,String b)
	{
		System.out.println("4th");
	}
	
	public static void main(String[] args) {
		This_keyword2 h1 = 	new This_keyword2();
	}

}
