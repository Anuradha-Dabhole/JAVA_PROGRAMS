package basicprogram;

public class PalindromString {

	public static void main(String[] args) {
		String Input="radar";
		String Output="";
		for(int i= Input.length()-1;i>=0;i--)
		{
			char c1=Input.charAt(i);
			Output = Output+c1;

		}
		System.out.println(Output);
		if(Input.equals(Output))
		{
			System.out.println("it is palindrom");
		}
		else
		{
			System.out.println("it is not palindrom");

		}
	}

}
