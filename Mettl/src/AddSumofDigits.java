import java.util.Scanner;

public class AddSumofDigits {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int result=findSumAtSpecificIndex(input1,input2,input3,input4);
		System.out.println(result);
	}

	private static int findSumAtSpecificIndex(int input1, int input2, int input3, int input4) {
		String str1=input1+"";
		String str2=input2+"";
		String str3=input3+"";
		int sum=0;
		if(input4==0)
		{
			sum+=(str1.charAt(0)-48)+(str2.charAt(0)-48)+(str3.charAt(0)-48);
		}
		else if(input4==1)
		{
			sum+=(str1.charAt(1)-48)+(str2.charAt(1)-48)+(str3.charAt(1)-48);
		}
		else if(input4==2)
		{
			sum+=(str1.charAt(2)-48)+(str2.charAt(2)-48)+(str3.charAt(2)-48);
		}
		return sum;
	}
}
