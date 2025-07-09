package basicprogram;

public class String_Buffer_Builder {

	public static void main(String[] args) {
String name= new String("My name");
String name1=name.concat(" Arati");
System.out.println(name1);
StringBuffer Age = new StringBuffer("21");
Age.append("   22");
System.out.println(Age);
StringBuilder Age1 = new StringBuilder("21");
Age1.append("   23");
System.out.println(Age1);

	}

}
