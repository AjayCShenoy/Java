import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int digit=sc.nextInt();
		int result =getDigitSum(digit);
	System.out.println(result);
		}
	private static int getDigitSum(int digit) {
		
		int rem=0;
		int sum=0;
		while(digit>0) {
			rem=digit%10;
			sum=sum+rem;
			digit=digit/10;	
		}
		if(sum>9)
		sum= getDigitSum(sum);
		return sum;
	}
}

