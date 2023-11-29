import java.util.Scanner;

public class DecimalToBinaryMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
	long result=DecimalToBinary.getBinary(N);
	System.out.println(result);
	}
}
