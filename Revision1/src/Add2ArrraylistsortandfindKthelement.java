import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Add2ArrraylistsortandfindKthelement {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(arr1[i]);
		}
		for(int i=0;i<m;i++) {
			list.add(arr2[i]);
		}
		Collections.sort(list);
		System.out.println(list.get(k-1));
	}
}
