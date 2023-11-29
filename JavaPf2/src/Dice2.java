import java.util.Scanner;

public class Dice2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value1");
		int n1=sc.nextInt();
		System.out.println("Enter value2");
		int n2=sc.nextInt();
		if(n1<0 || n2<0 || n1>6 || n2>6) {
			System.out.println("invalid input");
			return;
		}
		int sum = n1 + n2;
		int absDifference=Math.abs(8-sum);
		 if(sum<8) {
			 System.out.println(absDifference);
		 }
		 else {
			 System.out.println(2* absDifference);
		 }
		
	}
}
