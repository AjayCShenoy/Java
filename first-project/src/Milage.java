import java.util.Scanner;

public class Milage {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		int z=sc.nextInt();
		double noOfLiter=(double)z/x;
		double milage=y/noOfLiter;
		
		System.out.printf("%.2f" ,milage);
	
	}
}
