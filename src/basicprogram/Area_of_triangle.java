package basicprogram;

import java.util.Scanner;

public class Area_of_triangle {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the value for base");
int base = sc.nextInt();
System.out.println("Enter the value for length");
int length =sc.nextInt();
double d1=0.5*base*length;
System.out.println("Area of triangle is:"  +d1 );
	}

}
