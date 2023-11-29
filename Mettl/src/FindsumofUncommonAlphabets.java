import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindsumofUncommonAlphabets {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		char input1[]=new char[size1];
		if(size1 >=1 || size1<=15) 
		{
			for(int i=0;i<size1;i++)
			{
				input1[i]=Character.toUpperCase(sc.next().charAt(0));
			}
		}
		int size2=sc.nextInt();
		char input2[]=new char[size2];
		if(size2>=1||size2<=15)
		{
			for(int i=0;i<size2;i++)
			{
				input2[i]=Character.toUpperCase(sc.next().charAt(0));
			}
		}
		int result=findtheSum(input1,input2);
		
		while(result>9)
		{
			result=singledigit(result);
		}
		System.out.println(result);
	}

	private static int singledigit(int result) {
		int singlesum=0;
		while(result>0) 
		{
			int rem=result%10;
			singlesum+=rem;
			result=result/10;
		}
		return singlesum;
	}

	private static int findtheSum(char[] input1, char[] input2) {
		int sum=0;
		List<Character>list1=new ArrayList<>();
		for(int i=0;i<input1.length;i++) 
		{
			list1.add(input1[i]);
		}
		List<Character>list2=new ArrayList<>();
		for(int i=0;i<input2.length;i++)
		{
			list2.add(input2[i]);
		}
		List<Character>result=new ArrayList<>();
		result.addAll(list1);
		result.removeAll(list2);
		list2.removeAll(list1);
		result.addAll(list2);
		for(int i=0;i<result.size();i++) 
		{
			int x=result.get(i);
			sum+=x;
		}
		return sum;
	}
}
