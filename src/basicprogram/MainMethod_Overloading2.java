package basicprogram;
public class MainMethod_Overloading2 {
	public static void main() {
		System.out.println("Main method with no arguments");
	}
	static void main(String name, char gender) {
		System.out.println("Main method with arguments as String and gender");
	}

public void main(String name) {
	System.out.println("Non static Main method with single argument");
}
	public static void main(String[] args) {
		System.out.println("Main method");
		main();
		main("Prasad", 'M');
		MainMethod_Overloading2 m1 = new MainMethod_Overloading2();
		m1.main("Manisha");
	}
	
}