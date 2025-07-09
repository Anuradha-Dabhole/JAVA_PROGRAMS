package basicprogram;

public class MethodOverloading 
{
       static void addition(double a,double b ) 
       {
    	   double sum=a+b;
    	   System.out.println("The sum is:"+sum);
    	   
       }
       void addition(int a,int b ) 
       {
    	   int sum=a+b;
    	   System.out.println("The sum is:"+sum);
       } 
       static void addition(int a,double b ) 
       {
    	   double sum=a+b;
    	   System.out.println("The sum is:"+sum);
       }
       static void addition(double a,int b ) 
       {
    	   double sum=a+b;
    	   System.out.println("The sum is:"+sum);
       }
       static void addition(double b ) 
       {
    	   double sum=b;
    	   System.out.println("The sum is:"+sum);
       }
	public static void main(String[] args) {
		
      addition(6.96,9.98);
      addition(2,2.4);
      MethodOverloading  m1=new MethodOverloading ();
      m1.addition(4, 5);
      addition(34.66);
      
	}

}
