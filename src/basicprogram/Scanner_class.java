package basicprogram;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a:");
		int a= sc.nextInt();
		System.out.println("Enter the b:");
		int b= sc.nextInt();
        int sum=a+b;
        //System.out.println("string value");
        //String v=sc.next();
        sc.nextLine();
        
       System.out.println("The sum of two numbres is:" +sum);
       System.out.println("string value lines");
       String name = sc.nextLine();          // Read full line of text

       System.out.println("You entered: " + name);

sc.close();

	}

}
