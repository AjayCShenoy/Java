import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumofUncommonNumbers {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []input1=new int[n];
		for(int i=0;i<n;i++) {
			input1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int []input2=new int[m];
		for(int i=0;i<m;i++) {
			input2[i]=sc.nextInt();
		}
		int result=findsingedigitsumofUncommonNumber(input1,input2);
		while(result>9)
		{
			result=singledigitsum(result);
		}
		System.out.println(result);
	
	}

	private static int singledigitsum(int result) {
		int sum=0;
		while(result>0)
		{
			int rem=result%10;
			sum+=rem;
			result=result/10;
		}
		return sum;
	}

	private static int findsingedigitsumofUncommonNumber(int[] input1, int[] input2) {
		int sum=0;
		List<Integer>list1=Arrays.stream(input1)
				.boxed()
				.collect(Collectors.toList());
		List<Integer>list2=Arrays.stream(input2)
				.boxed()
				.collect(Collectors.toList());
		List<Integer>list3=new ArrayList<>();
		list3.addAll(list1);
		list3.removeAll(list2);
		list2.removeAll(list1);
		list3.addAll(list1);
		for(int i=0;i<list3.size();i++) {
			sum+=list3.get(i);	
		}
		return sum;
	}
}

//2nd test case has not passed some error in the code
