import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigits {
	
public static int sumOfDigits(String input) {

	 int sum = 0;
	 Pattern p = Pattern.compile("\\d");
	 Matcher m = p.matcher(input);
	 while (m.find()) 
	 {
	 sum += Integer.parseInt(m.group());
	 }

	 if (sum == 0) 
	 {
	 return -1;
	 } else 
	 {
	 return sum;
	 }
}

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String in=sc.next();
	System.out.println(sumOfDigits(in));
	 }
}

