package basicprogram;

public class NonStaticMethod {
	void addition()
	{
	System.out.println("Addition");
	}
	static void substraction()
	{
		System.out.println("substraction");
		
	}
	int a=10;

	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();
int a=100;
System.out.println(a);
		n1.addition();
		substraction();
		System.out.println("Hello");
		
	}

}
