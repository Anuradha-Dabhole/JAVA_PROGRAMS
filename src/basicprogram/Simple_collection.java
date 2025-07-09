package basicprogram;

import java.util.ArrayList;
import java.util.List;

import java.util.Collections;
import java.util.Iterator;

public class Simple_collection {

	public static void main(String[] args) {
    List m1=new ArrayList();
    m1.add(23);
    m1.add(24);
    m1.add(2);
    m1.add(33);
    m1.add(53);
   Collections.sort(m1);
  // System.out.println(m1);
   Iterator i1= m1.iterator();
   while(i1.hasNext()) {
	   System.out.println(i1.next());
	}
	}

}
