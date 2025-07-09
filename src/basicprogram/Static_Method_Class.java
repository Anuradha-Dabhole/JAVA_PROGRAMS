package basicprogram;
// How to call static method in main method
public class Static_Method_Class {
	static void method1() {
		System.out.println("Prasad");
	}
	static void method2() {
		System.out.println("Arati");
	}
	static void method3(int a) {
		System.out.println("Anuradha");
	}
	public static void main(String[] args) {
		System.out.println("Manu");
		method1();
		method1();
		method1();
		method1();
		//method1(abcd);
		method3(12);
		method2();
	}
}
