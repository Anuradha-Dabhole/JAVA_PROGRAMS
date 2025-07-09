package basicprogram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_blocks {

	public static void main(String[] args)
	{
		System.out.println("Please enter the value of array size ");
       try
       {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
		int[] rollno=new int[size];
		rollno[0]=90;
		rollno[1]=87;
		rollno[2]=99;
}
       catch(NegativeArraySizeException a1)
       {
    	   System.out.println("Please enter positive number");
    	   Scanner sc=new Scanner(System.in);
           int size=sc.nextInt();
   		int[] rollno=new int[size];
       }
       catch(InputMismatchException a2)
       {
    	   System.out.println("please enter the number only");
       }
       catch(ArrayIndexOutOfBoundsException a3)
       {
    	   System.out.println("array size is less,please increase it");

       }
       finally
       {
    	   System.out.println("close the connection with Database");
       }
}
}
