import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TwistedArray {

public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	int k=sc.nextInt();
	 List<Integer>a1=new ArrayList<>();
	 int orginal[]=arr.clone();
	Arrays.sort(arr);
	for(int i=0;i<k;i++)
	{
	 a1.add(arr[i]);
	}
	for(int i=0;i<n;i++) 
	{
	 if(!a1.contains(orginal[i]))
		 a1.add(orginal[i]);
	 }
	for(int i:a1) 
	{
		System.out.print(i+" ");
	}
	
  }

}
