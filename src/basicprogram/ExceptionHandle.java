package basicprogram;

public class ExceptionHandle {

	public static void main(String[] args) 
	{
		try 
		{
		int c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handle");
		}
	}

}
