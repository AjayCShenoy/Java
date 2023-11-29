import java.util.Arrays;
import java.util.Scanner;

public class CheckSpecialNumber {
    public static int MostSpecialNumber(int n,int[] arr){
        int f=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            f=0;
//            System.out.println(arr[i]);
            String str=arr[i]+"";
        for(int k=0;k<str.length();k++){
            for(int j=k+1;j<str.length();j++){
//               System.out.println("k:"+str.charAt(k));
//               System.out.println("j:"+str.charAt(j));
                if(str.charAt(k)==str.charAt(j))
                {
                    f=1;
//                    System.out.println("breaking....");
                    break;
                }
            }   
        }
            if(f!=1) 
            return arr[i];
        }
     return 0;   
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j]=scan.nextInt();
        }
        int result;
        result = MostSpecialNumber(n,arr);
        System.out.print(result);
        return ;
    }
}


// input 2 33 12    output 12

