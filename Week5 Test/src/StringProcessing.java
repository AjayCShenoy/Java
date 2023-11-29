import java.util.Scanner;

public class StringProcessing {
	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 String str1=sc.next();
		 String str2=sc.next();
		 String result=StringPmethod.getCombo(str1, str2);
		 System.out.println(result);
		 
		 }
	}

