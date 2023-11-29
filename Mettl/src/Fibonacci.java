import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int result=findposition(x);
		System.out.println(result);
	}

	private static int findposition(int x) {
		int count=0,sum=0,n1=0,n2=1;
		for(int i=0;sum!=x;i++)
		{
			sum=sum+n1;
			n1=n2;
			n2=sum;
			count++;
		}
		return count;
	}
}
