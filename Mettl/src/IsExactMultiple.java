import java.util.Scanner;

public class IsExactMultiple {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int result=IsExactMultiple(input1,input2);
		System.out.println(result);
	}

	private static int IsExactMultiple(int input1, int input2) {
		if(input1==0 || input2==0)
			return 3;
		if(input2%input1==0)
			return 2;
		else
		return 1;
	}
}
