import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListtoStringArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		List<String>list1=new ArrayList<>();
		int n=sc.nextInt();
		List<String>list2=new ArrayList<>();
		for(int i=0;i<m;i++) {
			list1.add(sc.next());
		}
		for(int i=0;i<n;i++) {
			list2.add(sc.next()); 
		}
		
		
	}
}
