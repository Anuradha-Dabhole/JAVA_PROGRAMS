package basicprogram;

public class Data_type1 {
         static void add(String d,int c,boolean f)
         {
        	 System.out.println("My values are");
        	 System.out.println(d);
        	 System.out.println(c);
        	 System.out.println(f);

         }
         void add1()
         {
        	 int a=100;
        	 int b=300;
        	 int sum1 = a+b;
        	 System.out.println(sum1);
        	 
         }
	public static void main(String[] args) {
		add("Arati",12,false);
		Data_type1 b1 = new Data_type1 ();
		b1.add1();
	}

}
