import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAsciiSumofFirstandLastElement {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		int result=findAsciiSum(input);
		System.out.println(result);
	}
	private static int findAsciiSum(String input) {	
		int sum=0;
		Pattern p=Pattern.compile(" ");
		Matcher m=p.matcher(input);
		if(m.find()) 
		{
			return 1;
		}
		else
		{
		sum=input.charAt(0)+input.charAt(input.length()-1);
		}
		return sum;
	
}
}