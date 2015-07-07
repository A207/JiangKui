package exercise;

import java.util.Scanner;

public class switch02
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     String monthstring=scanner.nextLine();
     int a=0;
     switch(monthstring.toLowerCase())
     {
     case "monday":a=1;break;
     case "tuesday":a=2;break;
     case "wednesday":a=3;break;
     case "thursday":a=4;break;
     case "friday":a=5;break;
     case "saturday":a=6;break;
     case "sunday":a=7;break;
     default:a=0;
     }
     if(a==0)
     System.out.println("Œﬁ–ß ‰»Î");
     else 
    	 System.out.println(a);
	}

}
