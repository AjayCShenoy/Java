import java.util.Scanner;

public class SumOfPrimeDigits {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String result=findprimeSum(input);
		System.out.println(result);
	}

	private static String findprimeSum(int input) {
		String str=input+"";
		int sum=0;
		String out=new String();
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='5'||str.charAt(i)=='7')
		  {
			sum+=str.charAt(i)-48;
			out=out+str.charAt(i);
		  }
		else if(str.charAt(i)=='1')
			continue;
		}
		if(out.isEmpty())
		{
			out+=str.charAt(0);
			sum=str.charAt(str.length()-1)-48;
		}
			
		return out+""+":"+sum;
	}
}						
