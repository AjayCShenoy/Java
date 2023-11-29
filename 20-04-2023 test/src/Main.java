import java.util.Scanner;

public class Main
{
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int no1=sc.nextInt();
	int no2=sc.nextInt();
	
	if(no1>6||no2>6) {
		System.out.println("invalid input");
		System.exit(0);
		
	}
	int sum=no1+no2;
	if(no1==no2) {
		sum*=2;
		
	}
	System.out.println(sum);
	
	
}
}
