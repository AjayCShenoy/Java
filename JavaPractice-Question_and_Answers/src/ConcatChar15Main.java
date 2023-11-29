import java.util.Scanner;

public class ConcatChar15Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
		}
		String result=concatLastChar(str);
		System.out.println(result);
	}

	private static String concatLastChar(String[] str) {
		StringBuilder sb=new StringBuilder();
		String result=null;
		for(int i=0;i<str.length;i++) {
			int l=str[i].length()-1;
			sb.append(str[i].charAt(l));
		}
		result =sb.toString();
		return result;
	}
}
