import java.util.Scanner;

public class Fullprime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int count=0;
		
		outer:
		for(int i=x;i<=y;i++)
		{
			if(isPrime(i))
			{
				String str=String.valueOf(i);
				char[] arr = str.toCharArray();
				
				inner:
				for(char c : arr)
				{
					int digit=c-48;
					if(!isPrime(digit))
					{
				
						continue outer;
					}
				}
				System.out.println(i);
				count=1;
			}
			
			
		}
		if (count==0) {
			System.out.println(-1);
		}
		
	}

	private static boolean isPrime(int num) {
		
		if(num<2)
			return false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
			
		}
		return true;
	}

}