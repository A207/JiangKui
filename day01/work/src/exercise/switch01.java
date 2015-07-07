package exercise;

import java.util.Scanner;

public class switch01 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      int day=scanner.nextInt();
      String monthstring="";
      switch(day)
      {
      case 1:monthstring="Monday";break;
      case 2:monthstring="Tuesday";break;
      case 3:monthstring="Wednesday";break;
      case 4:monthstring="Thursday";break;
      case 5:monthstring="Friday";break;
      case 6:monthstring="Saturday";break;
      case 7:monthstring="Sunday";break;
      default:monthstring="error date";
      }
      System.out.println(""+monthstring);
	}

}
