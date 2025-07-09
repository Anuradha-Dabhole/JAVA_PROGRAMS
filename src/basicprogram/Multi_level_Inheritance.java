package basicprogram;
class My
{
	static void add()
	{
		System.out.println("Hii");
}
}
	class Two extends My
	{
		static void sub()
		{
			System.out.println("Hello");
		}
	}


public class Multi_level_Inheritance extends Two
{
	static void multi()
	{
		System.out.println("XYZ");
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		multi();
	}

}
