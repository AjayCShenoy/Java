import java.util.Scanner;
public class FlushCharactersMain {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String result=FlushCharacters.getSpecialChar(s);
		System.out.println(result);
	}
}
