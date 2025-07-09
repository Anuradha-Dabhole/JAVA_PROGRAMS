package basicprogram;

public class Nested_ifelse {

	public static void main(String[] args) {
		char gender1='M';
		char gender2='F';
		int age=10;
		if(gender1=='M')
		{
			if(age>12)
			{
				System.out.println("Adult fare");
			}
			else
			{
				System.out.println("half ticket");
			
			}
			
		}
		else
		{
			System.out.println("Free for female");
		
		}

	}

}

