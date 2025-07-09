package basicprogram;
 class One 
{
static void add()
{
	System.out.println("add");
}

static void sub()
{
	System.out.println("sub");
}
}

public class Single_Inheritance extends One 
{
	static void multi()
	{
		System.out.println("multi");
	}
	
static void div()
{
	System.out.println("div");
}


	public static void main(String[] args)
	{
	add();
	sub();
	multi();
	div();
}
}
