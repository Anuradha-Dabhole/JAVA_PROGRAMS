package basicprogram;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) 
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value of Pi:");
		double pi=s1.nextDouble();
		System.out.println("Enter the value of radius:");
		double r=s1.nextDouble();
		double area=pi*r*r;
		System.out.println(" Area of circle is:" +area);
	}

}
