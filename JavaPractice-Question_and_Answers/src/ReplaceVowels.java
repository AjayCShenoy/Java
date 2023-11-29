import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		String result=ReplaceV(S);
		System.out.println(result);
	}

	private static String ReplaceV(String S) {
		String out="";
		for(int i=0;i<S.length();i++) {
			char ch=S.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				out=out+'3';
//				break;
			}
			else {
				out=out+ch;
			}
				
		}
		return out;
	}
}
