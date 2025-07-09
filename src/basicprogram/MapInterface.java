package basicprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		Map<String,Integer> h1= new HashMap<String,Integer>();
		h1.put("Arati",9876);
		h1.put("std",15);
		h1.put("college",897);
		h1.put("Sub",54);
		//System.out.println(h1);
		
		//System.out.println("**Keys Here**");
		for(String s1: h1.keySet())
		{
			System.out.println(s1);
		}
		//System.out.println("**Values Here**");
		for(Integer i1: h1.values())
		{
			System.out.println(i1);
		}
		for(Entry<String,Integer> d1: h1.entrySet())
		{
			System.out.println(d1);
		}
		h1.replace("Arati", 9275);
		System.out.println(h1);
		h1.replace("Arati",9275,3927);//old value,new value
		System.out.println(h1);
		
		h1.remove("college");//with object
		System.out.println(h1);
		h1.remove("Sub",54);//with key and value
		System.out.println(h1);
	}

}
