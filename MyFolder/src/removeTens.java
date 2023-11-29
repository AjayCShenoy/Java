import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeTens {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int result[]=removeTens(n,arr);
	System.out.println(result);
	}

private static int[] removeTens(int n, int[] arr) {
	List<Integer>list=new ArrayList<>();
	for(int i=0;i<n;i++) {
		if(arr[i]!=0)
		{
			list.add(arr[i]);
		}
	}
		if(list.size()!=n)
		{
			n=n-list.size();
		}
		for(int j=0;j<n;j++) {
			list.add(0);
		}
		System.out.println(list);
		int []result=list.stream()
				.mapToInt(i->i).toArray();
	System.out.println(result.toString());
	return result ;
}

}
