import java.util.Scanner;

public class AbundantNumber{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int f=0;
	int l1=sc.nextInt();
	int l2=sc.nextInt();
	for(int i=l1;i<=l2;i++) 
	{
		int sum=0;
		for(int j=1;j<=i/2;j++) {
			if(i%j==0) {
				sum=sum+j;
//System.out.println("sum="+sum);
			}
		}
		if(sum>i) {
			System.out.print(i+" ");
			f=1;
}
}
if(f==0) {
 System.out.println("-1");
}
 }
   }


