import java.util.Scanner;

public class Anagram21Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String result=Anagram21.getAnagram(s1,s2);
		System.out.println(result);
	}
}
