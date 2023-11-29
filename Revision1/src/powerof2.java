import java.util.Scanner;

public class powerof2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean result=ispowerof2(n);
		System.out.println(result);
	}

	private static boolean ispowerof2(int n) {
//		System.out.println(n);
//		System.out.println(n&(n-1));
		return n > 0 && (n & (n - 1)) == 0;	
	}
}

