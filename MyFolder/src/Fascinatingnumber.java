import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// input a number multiply the number with 2 , and then multiply the number with 3 concate the n,p1,p2
// if the string contains 1-9 then it is fascinating else not fascinating;

public class Fascinatingnumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long mulby2=n*2;
		long mulby3=n*3;
		String str=null;
		str=n+""+mulby2+mulby3;
		char c[]=str.toCharArray();
		Arrays.sort(c);
		char temp[]= {'1','2','3','4','5','6','7','8','9'};
		if(Arrays.equals(temp,c)) {
			System.out.println("Fascinating");
		}
		else 
			System.out.println("not Fascinating");
	}
}

