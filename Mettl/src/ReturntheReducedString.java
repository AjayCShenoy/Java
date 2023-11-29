import java.util.Scanner;

public class ReturntheReducedString {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		input.toUpperCase();
		String result=reducedString(input);
		System.out.println(result);
	}

	private static String reducedString(String input) {
		String str=input.charAt(0)+"";
		if(input.length()%2==0)
		{
			for(int i=1;i<input.length();i++) {
				if(i%2!=0) {
					str=str+input.charAt(i);
				}
			}
		}
		else 
			for(int i=1;i<input.length();i++) {
				if(i%2==0) {
					str=str+input.charAt(i);
				}
			}
	
		
		return str;
	}
}
