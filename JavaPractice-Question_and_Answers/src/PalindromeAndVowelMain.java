import java.util.Scanner;

public class PalindromeAndVowelMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String result=PalindromeAndVowel.checkPalin(str);
		System.out.println(result);
	}
}
