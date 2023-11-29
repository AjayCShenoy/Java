import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 		input=12#%4
//		output=7

public class SingleDigitSum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int result=findSingleDigitSum(input);
		System.out.println(result);
	}

	private static int findSingleDigitSum(String input) {
	
		int sum=0;
		int n=Integer.parseInt(input.replaceAll("[a-zA-Z\\W]",""));
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		if(sum>9) {
			String s=sum+"";
			sum=findSingleDigitSum(s);
			
		}
		return sum;
	}
}
