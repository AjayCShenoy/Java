import java.util.Scanner;

public class LuckySumMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result=LuckySum.getLuckySum(a, b, c);
		
	System.out.println(result);
	}
}
