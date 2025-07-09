package basicprogram;

import java.util.ArrayList;

public class Vector_methods {

	public static void main(String[] args) {
ArrayList a1 = new ArrayList();
a1.add(12);
a1.add("myname");
a1.add(23);
a1.add("mkt");
a1.add('c');

ArrayList a2 = new ArrayList();
a2.add("Computer");
a2.add("automation");
a2.addAll(a1);
System.out.println(a1);
System.out.println(a2);
//a2.remove(0);
//System.out.println(a2);

a1.remove("mkt");
System.out.println(a1);

//a2.removeAll(a1);
//System.out.println(a2);



	}

}
