import java.util.Scanner;

public class VowelCountInString {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int result=findnoOfVowels(input);
		System.out.println(result);
		
	}

	private static int findnoOfVowels(String input) {
		input.toLowerCase();
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}
