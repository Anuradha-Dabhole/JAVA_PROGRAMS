package basicprogram;

public class This_keyword {
	This_keyword()
	{
		
	System.out.println("1st");
	}
	This_keyword(int a)
	{
		this();
		System.out.println("2nd");
	}
public static void main(String[] args) {
	new This_keyword(20);
		
}
}
