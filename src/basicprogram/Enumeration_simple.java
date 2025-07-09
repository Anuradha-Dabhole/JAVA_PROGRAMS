package basicprogram;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_simple {

	public static void main(String[] args) {
Vector v1 = new Vector();
v1.add(12);
v1.add("mkt");
v1.add(11);
v1.add(16);
v1.add(true);
Enumeration  e1 =v1.elements();
while(e1.hasMoreElements())
{
	System.out.println(e1.nextElement());
}

	}

}
