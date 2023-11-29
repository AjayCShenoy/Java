import java.util.GregorianCalendar;
import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	int m=sc.nextInt();
	int result=finddays(y,m);
	System.out.println(result);
	}

	private static int finddays(int y, int m) {
		int days=0;
		if(m==0||m==2||m==4||m==6||m==7||m==9||m==11)
		{
			days=31;
		}
		else if(m==3||m==5||m==8||m==10)
		{
			days=30;
		}
		else if(m==1) {
		GregorianCalendar gc=new GregorianCalendar();
		boolean b=gc.isLeapYear(y);
		if(b==true) {
			days=29;
		}
		else
			days=28;
		return days;
		
	}
		return days;
}
}


	
