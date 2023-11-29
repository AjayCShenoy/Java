import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrtoStringArr11Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String>list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		String result[]=ArrtoStringArr11.convertToStringArray(list);
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
	}
}
