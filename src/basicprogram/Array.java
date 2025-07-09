package basicprogram;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int rollno []=new int[4];
		rollno[0]=12;
		rollno[1]=23;
		rollno[2]=32;
		rollno[3]=32;
		for(int i=0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}
	String name []=new String[4];
		name[0]="ram";
		name[1]="sham";
		name[2]="radha";
		name[3]="";
		for(int i=0;i<=3;i++)
		{
			System.out.println(Arrays.toString(name));
		}
		char[] gender = new char[3];
		 gender[0]='F';
		 gender[1]='M';
		 gender[2]='C';
		 System.out.println(Arrays.toString(gender));
	}

}
