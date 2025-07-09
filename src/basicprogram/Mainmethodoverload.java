package basicprogram;

public class Mainmethodoverload {

	public static void main(String[] args)
	{
		
System.out.println("Main method");
Mainmethodoverload m1=new Mainmethodoverload();
m1.main();
main("Arati",'F');
	}
 void main() 
{
	System.out.println("no argument passed");
		

	}
public static void main(String name,char gender) 
{
System.out.println("argument passed");	
	

}

}
