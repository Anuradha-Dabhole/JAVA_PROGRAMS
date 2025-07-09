package basicprogram;

import java.util.Arrays;

public class Array_Checking {

	public static void main(String[] args) {
		int n1[]=new int[4];
		n1[0]=78;
		n1[1]=77;
		n1[2]=4;
		n1[3]=75;
		   
		int n2[]=new int[4];
		n2[0]=78;
		n2[1]=77;
		n2[2]=74;
		n2[3]=75;

boolean b1 = Arrays.equals(n1, n2);
System.out.println(b1);
if(b1==true)
{
	System.out.println("it is same");
}
else
{
	System.out.println("it is not same");
}
	}

}
