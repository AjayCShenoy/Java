import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		Integer input =sc.nextInt();
		GregorianCalendar c=new GregorianCalendar();
		if(c.isLeapYear(input))
		{
			System.out.println("yes leap year");
		}
		else
			System.out.println("not a leap year");
	}
}
