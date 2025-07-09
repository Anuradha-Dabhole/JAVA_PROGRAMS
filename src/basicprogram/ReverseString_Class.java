package basicprogram;

public class ReverseString_Class {

	public static void main(String[] args) {
		String Input="arati";
		String Output="";
		for(int i= Input.length()-1;i>=0;i--)
		{
			char c1=Input.charAt(i);
			Output = Output+c1;

		}
		System.out.println(Output);
		
	}

}
