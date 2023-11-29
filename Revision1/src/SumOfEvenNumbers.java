import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SumOfEvenNumbers {
	public static void main(String[]args) {
		List<Integer>marks=Arrays.asList(1,2,3,4);
//		check and filter put even numbers
//		after filtering find the sum
//		
		Integer result=marks.stream().filter((a)->a%2==0)
				.reduce(0,(a,b)->a+b);
		System.out.println(result);

	}
}
