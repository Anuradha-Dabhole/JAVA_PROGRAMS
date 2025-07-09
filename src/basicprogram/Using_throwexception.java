package basicprogram;

import java.util.Scanner;

public class Using_throwexception 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int age=sc.nextInt();
	throw new NullPointerException("this is empty");

}
}
