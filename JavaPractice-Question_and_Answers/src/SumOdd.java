import java.util.Scanner;

public class SumOdd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int result=findOddSum(N);
		System.out.println(result);
	}

	private static int findOddSum(int N) {
		int []arr=new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		return sum;
	}
}
