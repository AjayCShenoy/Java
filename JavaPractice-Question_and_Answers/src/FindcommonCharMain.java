import java.util.Scanner;

public class FindcommonCharMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int output=FindcommonChar.getcommonChars(str1,str2);
		System.out.println(output);
		
		}
}
