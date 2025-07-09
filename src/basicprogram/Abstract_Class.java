package basicprogram;
abstract class Class1{
	abstract void login();//abstract method
	abstract void registration();//abstract method
	void login1()//concrete method
	{
		System.out.println("Login to browser");
	}
}
abstract class Class2 extends Class1{
	abstract void  Method1();//abstract method
	abstract void Method2();//abstract method
}


public class Abstract_Class extends Class2{

	public static void main(String[] args) {
		Abstract_Class c1 = new Abstract_Class();
		c1.login1();

	}

	@Override
	void Method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void Method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void registration() {
		// TODO Auto-generated method stub
		
	}

}
