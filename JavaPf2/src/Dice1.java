import java.util.Scanner;

public class Dice1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value 1");
		int n1=sc.nextInt();
		System.out.println("Enter value 2");
		int n2=sc.nextInt();
		int sum=0;
		
		if(n1>n2) {
			System.out.println("Invalid input");
		}
		else {
		if(n1==n2) {
			sum=(n1+n2)*2;
			System.out.println(sum);
		}
		else {
			sum=n1+n2;
			System.out.println(sum);
		}
		
	}
}
}


