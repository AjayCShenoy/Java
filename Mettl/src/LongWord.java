import java.util.Scanner;

public class LongWord {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String result=findLongWord(input);
		System.out.println(result);
	}

	private static String findLongWord(String input) {
		
		String result=new String();
		if(input.length()>10) {
			int n=input.length()-2;
			result=input.charAt(0)+""+n+input.charAt(input.length()-1);
		}
		else result=input;
		return result;
	}
}
