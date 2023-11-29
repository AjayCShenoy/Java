import java.util.Scanner;

public class IPValidatormain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String result=IPValidator.getIP(s1);
		System.out.println(result);
	}
}
