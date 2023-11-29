import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharactersOrSumOfDigits {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		int input2=sc.nextInt();
		String result=findcharOrDigitSum(input1,input2);
		System.out.println(result);
	}
	private static String findcharOrDigitSum(String input1, int input2) {
		int sum=0;
		String str=new String();
		String output=new String();
		if(input2==0 && input1!=null)
		{	
			Pattern p=Pattern.compile("\\d");
			Matcher m=p.matcher(input1);
			if(!m.find())
				output="Zero";
			while(m.find())
			{
				sum+=Integer.parseInt(m.group());
			}
			output=sum+"";
			return output;
		}
		else if(input2==1 && input1!=null)
		{
			Pattern p=Pattern.compile("\\D");
			Matcher m=p.matcher(input1);
			if(!m.find())
				str="Zero";
			while(m.find())
			{
				str=str+m.group();
			}
			return str;
		}
		else
		return null;
		
	}
}
