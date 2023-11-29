import java.util.Scanner;

public class ListofNonPrime {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter lower limit");
	int l=sc.nextInt();
	System.out.println("Enter upper limit");
	int u=sc.nextInt();
	for(int i=l;i<u;i++)
	{
		if(!isPrime(i))
		{
			System.out.println(i);
		}
	}
}
	private static boolean isPrime(int number) {
		if(number==1) 
			return false;
		if (number==2)
			return false;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
}


