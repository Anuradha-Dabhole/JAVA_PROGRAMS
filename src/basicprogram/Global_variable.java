package basicprogram;
public class Global_variable 
{
    static int a=90;
    int g=40;
    void name(String newname)
    {
      System.out.println("myname   "   +newname);
    }
	public static void main(String[] args)
	{
		Global_variable b1=new Global_variable();
		b1.g=29;//update the value
		a=12;
		
		b1.name("Arati");
     System.out.println(b1.g);
     System.out.println(a);
	}

}
