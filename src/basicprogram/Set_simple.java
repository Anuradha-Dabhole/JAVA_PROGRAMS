package basicprogram;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_simple {

	public static void main(String[] args) {
		Set d1=new HashSet();
		d1.add(46);
		d1.add(446);
		d1.add(4);
		d1.add("ABC");
		Iterator i1=d1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
		
		
         
	}

}
