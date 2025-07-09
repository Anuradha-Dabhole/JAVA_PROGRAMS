package basicprogram;

class Child
{
void login()
{
	System.out.println("Login with mobile");
}
}

public class Method_Overriding extends Child
{
	void login()
	{
		super.login();
		System.out.println("Login with Email Id");
	}

	public static void main(String[] args) {
	
		Method_Overriding c1 = new Method_Overriding();
		c1.login();
		Child c2=new Child();
		c2.login();
				
	}

}
