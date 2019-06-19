import java.util.Scanner;

public class DisplayDate 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		//create a string Date
		String Date;
		System.out.println("Please enter a valid date in the format mm/dd/yyyy");
		Scanner keyboard= new Scanner(System.in);
		Date= keyboard.nextLine();
		
		//define position of backslashes
		int firstBackslash = Date.indexOf("/");
		int lastBackslash = Date.lastIndexOf("/");
		

		//define position of month and day
		String month = Date.substring(0,firstBackslash);
		String day = Date.substring(firstBackslash+1,lastBackslash);
		
		//convert string to integer value
		int s1 = Integer.valueOf(month);
		int s2 = Integer.valueOf(day);
		
		// If feb. , then day should not be greater than 29, otherwise continue....
		if (s1==2 && s2>29)
		{
			System.out.println("It is an invalid date because feburary do not have this day! " + day);
		}
		// else continue... 
		else
		{	
		// month range defined 1-12	
			if (s1 >= 1 && s1 <=12)
			{
				if (s2 >=1 && s2 <=30) // day range defined 1-30
				{
					System.out.println("It is a valid date!");
				}
				else
				{
					System.out.println("It is a invalid date because of your invalid day! " + day);
				}
			}
			else
			{
				System.out.println("It is an invalid date because of your invalid month! " + month);
			}
		}
	}
}
