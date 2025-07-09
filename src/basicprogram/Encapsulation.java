package basicprogram;
class Amazon
{
	private String password="anu765";

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) 
	{
       Amazon a1 =new Amazon();
       a1.setPassword("arati7654");
       System.out.println(a1.getPassword());
	}

}
