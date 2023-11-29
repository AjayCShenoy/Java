import java.util.Scanner;

public class GetdigitSum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int result=AddandRev(arr,k);
		System.out.println(result);
}

	private static int AddandRev(int[] arr, int k) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>k) {
				sum+=arr[i];
			}
		}
		int rev=0;int rem=0;
		while(sum>0) {
			rev=sum%10;
			rem=rev*10+rem;
			sum=sum/10;
			
		}
		return rev;
	}
}
