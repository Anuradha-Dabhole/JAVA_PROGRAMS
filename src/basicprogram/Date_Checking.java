package basicprogram;

import java.util.Date;

public class Date_Checking {

	public static void main(String[] args) {
Date d1= new Date();
long l1=d1.getTime();//time given in numbers epoch format
System.out.println(l1);

Date d2= new Date(d1.getTime()+(1000*60*60*24*9));//give next 9 date and time
System.out.println(d2);//time given in human readable format

String d3=d2.toString();
String month=d3.substring(4,7);//return month
System.out.println(month);

 String year=d3.substring(d3.length()-4);//return year
 System.out.println(year);
 
 String date =d3.substring(8,10);//return date
 System.out.println(date);
 
 String dateformate1= date.concat("-").concat(month).concat("-").concat(year);
 System.out.println(dateformate1);//return date,month,year in one line
}

}
