package basicprogram;
public class StringbasicMethods {

	public static void main(String[] args) 
	{
	String s1="Anuradha";
	boolean b1=s1.equalsIgnoreCase("anuradha");
	System.out.println(b1);
	
	String s2="kv no 2";
	String s3=s2.replace("k", "n");
	System.out.println(s3);
	
	String s4="arati dabhole";
	String s5=s4.replace("dabhole", "Dhole");
	System.out.println(s5);
	
	String a="kv no 2";
	String b=a.replaceAll("[a-z]", "");
	System.out.println(b);
   
	String z="My bank balance is 8345 INR";
    String c=z.replaceAll("[0-9]", "");
    System.out.println(c);

    String name="cat";
    boolean b2=name.matches("...");
    System.out.println(b2);

    
    String name1="cat";
    boolean b3=name1.matches("d(.*)");
    System.out.println(b3);
    
    boolean b4=name1.matches("(.*)t");
    System.out.println(b4);
    

    String name2="Anuradha";
    boolean b5=name2.matches("(.*)r(.*)");
    System.out.println(b5);
	}

}
