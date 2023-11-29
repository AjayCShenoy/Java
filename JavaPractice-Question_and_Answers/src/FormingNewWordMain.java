import java.util.Scanner;

public class FormingNewWordMain{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		StringBuffer result=FormingNewWord.getformnewword(s,n);
		System.out.println(result);
	}
}
