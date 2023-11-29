import java.util.Scanner;

public class SmoothArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		smootharrayFun(arr,n);
		
		}

	private static void smootharrayFun(int[] arr, int n) {
		int mid=0;
		
		if(n%2==0)
		{
			mid= arr[(n/2)]+arr[(n/2)-1];
		}
		else {
			mid=arr[n/2];
			}
		System.out.println(arr[0]+" "+ mid + " " + arr[n-1]);
		if(arr[0]==arr[n-1] && arr[0]==mid) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	
}
