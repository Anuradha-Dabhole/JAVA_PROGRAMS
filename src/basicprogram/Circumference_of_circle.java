package basicprogram;

import java.util.Scanner;

public class Circumference_of_circle{

	public static void main(String[] args) {
Scanner sc3 = new Scanner(System.in);
System.out.println("Enter the value of pi");
double pi = sc3.nextDouble();
System.out.println("Enter the value of radius");
int r = sc3.nextInt();
double c1=2*pi*r;
System.out.println("circumference is:" +c1);
	}

}
