import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Arrayproblems {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int[]arr= {1,2,3,4,5,6};
		int sum=0;
		for(int e:arr) {
		 System.out.println(e);
			sum+=e;
		}
		System.out.println(sum);
	}
}
