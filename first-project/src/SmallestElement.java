import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int []temp=new int[size];
        temp=Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<n;j++)
              {
                  if(temp[i]==arr[j])
                  {
                        System.out.print(temp[i]);
                        System.out.print(" ");
                  }
              }

        }
 
    }

}
