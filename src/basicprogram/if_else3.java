package basicprogram;

import java.util.Scanner;

public class if_else3 {

	public static void main(String[] args) {
		
		/*char gender1 = 'S';
		char gender2 = 'D';
		int age =5;
		if (gender2!= 'D') {
			if (age < 3) {
				System.out.println("No Fare for male child");
			}
			else if (age > 12) {
				System.out.println("Adult Fare");
			} else {
				System.out.println("Half ticket Fare");
			}
		}
		else {
			System.out.println("No fare for female");
		}

	}

}*/
		int a = 10;
		int b = 20;
		if (a < b && a == 10) {
			System.out.println("1");
		}
		if (a == b || a == 10) {
			System.out.println("2");
		}
		if (!(a < b && a == 10)) {
			System.out.println("3");
		}
		if (!(a == b || a == 10)) {
			System.out.println("4");
		}
	}
}

