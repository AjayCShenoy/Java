import java.util.Scanner;

public class StringProcessingMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n=sc.nextInt();
		boolean result=StringProcessing.isEqual(s1, s2 ,n);	
		System.out.println(result);
	}
}
