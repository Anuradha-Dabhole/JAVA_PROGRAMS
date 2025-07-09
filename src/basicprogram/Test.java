package basicprogram;

class Reporting 
{
	Reporting (String a)
	{
		System.out.println("Reporting");
	}
	
}
class Screenshot extends Reporting
{
	
	Screenshot(int a,int b)
	{ 
		super("Arati");
		System.out.println("Screenshot");
	}
}
public class Test extends Screenshot
{
	
	Test()
	{
		super(10,20);// implicit and explicit
		System.out.println("Test");
	}
	public static void main(String[] args) {
	new	Test();
	}
}
	

