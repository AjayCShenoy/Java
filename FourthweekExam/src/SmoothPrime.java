import java.util.Scanner;

public class SmoothPrime{
	 static boolean isPrime(int n) {
	 if(n<=1)
	 return false;
	for(int i=2;i<n;i++) 
	if(n%i==0)
		return false;
	return true;
}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(isPrime(n-1) && isPrime(n+1)) 
		{
		System.out.println("True");
		System.out.println(n-1);
		System.out.println(n+1);
		} 
		}
}