package basicprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iteration {

	public static void main(String[] args) {
                 List l1= new ArrayList();
                     l1.add(23);
                     l1.add(22);
                     l1.add(25);
                     l1.add(26);
                     l1.add(27);
                     l1.add(28);
                     ListIterator l2= l1. listIterator();
                     System.out.println("Farward");
                     while(l2.hasNext())
                     {
                    	 System.out.println(l2.next());
                     }
                     System.out.println("Backward");

                     while(l2.hasPrevious())
                     {
                    	 System.out.println(l2.previous());
                     }



	}

}