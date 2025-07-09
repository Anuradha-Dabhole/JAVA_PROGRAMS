package basicprogram;

import java.util.HashMap;
import java.util.Map;

public class Map_concepts {

	public static void main(String[] args) {
Map<String,Integer> h1= new HashMap<String,Integer>();
h1.put("Arati",9876);
h1.put("std",15);
h1.put("college",897);
h1.put("Sub",54);
System.out.println(h1);



Map h2= new HashMap();
h2.put("nm",33);
h2.putAll(h1);
System.out.println(h2);
boolean b1=h1.isEmpty();
System.out.println(b1);
h1.clear();
System.out.println(h1);
	}

}
