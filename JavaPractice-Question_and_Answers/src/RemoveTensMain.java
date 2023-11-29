import java.util.List;
import java.util.Scanner;

public class RemoveTensMain {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		List<Integer> result=Remove10s.removeTens(n, arr);
		System.out.println(result);
		
	}
	
}
