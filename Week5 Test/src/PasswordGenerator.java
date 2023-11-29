import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First name:");
		String fname=sc.nextLine();
		System.out.println("Last name:");
		String lname=sc.nextLine();
		String output="";
		System.out.println("Age:");
		int age=sc.nextInt();
		
	    output+=Character.toUpperCase(fname.charAt(0))+""+fname.charAt(1)+""+fname.charAt(2);
	    output+=lname.charAt(lname.length()-3)+""+lname.charAt(lname.length()-2)+""+lname.charAt(lname.length()-1);
		output+="@"+age+"";
		System.out.println(output);
		
	}
}