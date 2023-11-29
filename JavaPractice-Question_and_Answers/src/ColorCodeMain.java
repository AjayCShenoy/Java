import java.util.Scanner;

public class ColorCodeMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int result =ColorCode.getColorcode(str);
		System.out.println(result);
	}
}
