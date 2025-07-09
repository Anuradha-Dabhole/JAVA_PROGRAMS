package basicprogram;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args)
	{
          Collection c1=new ArrayList();
          c1.add("Arati");
          c1.add(1234);
          c1.add(true);
          c1.add(3.4);
          c1.add('v');
          System.out.println(c1);
          
          Collection c2 =new ArrayList();
                c2.addAll(c1);
                 c2.add(123);
                 System.out.println(c2);
                 boolean b3=c1.equals(c2);
                 System.out.println(b3);
                 //c1.clear();
                 System.out.println(c1);
                 System.out.println(c2);
                 boolean b4=c1.isEmpty();
                 System.out.println(b4);
                 c1.remove("Arati");
                 System.out.println("The new c1->" +c1); 
                c2.removeAll(c1);
                System.out.println("The new c2->" +c2);
                
          }

}
