
public class UserMainMethod {
	
	public static int getDigitSum(int digit) {
		int rem=0;
		int sum=0;
		
		while(digit>0)
		{
			rem=digit%10;
			sum=sum+rem;
			digit=digit/10;
		}
		if(sum>9) {
			sum=getDigitSum(sum);
		}
		return sum;
	}
	
}
