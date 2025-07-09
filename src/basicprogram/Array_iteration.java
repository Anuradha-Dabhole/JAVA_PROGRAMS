package basicprogram;

import java.util.Arrays;

public class Array_iteration {

	public static void main(String[] args) {
		int Array1[]= new int[4];
		Array1[0]=21;
		Array1[1]=22;
		Array1[2]=23;
		Array1[3]=24;
		int Array2[]=new int[4];
		for(int i=0,k=3;i<4;i++,k--)
		{
			
			Array2[k]=Array1[i];
			
		}
		
	
	System.out.println(Arrays.toString(Array1));
	System.out.println(Arrays.toString(Array2));
		

	}
}


