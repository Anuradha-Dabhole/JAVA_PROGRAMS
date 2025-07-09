package basicprogram;

import java.util.Arrays;
import java.util.Scanner;

public class Runtime_user_input_of_Array {

	public static void main(String[] args) {
		
int MY[]=new int[4];
         Scanner s4 = new Scanner(System.in);
         
         
         for(int i=0; i<4;i++)
         {
        	MY[i]=s4.nextInt();
        	
         }
         System.out.println(Arrays.toString(MY));
        		 }

}
