import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		// split this input by ,
		StringTokenizer st=new StringTokenizer(input, ".");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
}
}
 