import java.util.Arrays;
import java.util.List;

public class SumofOddStreamMethod {
	public static void main(String[]args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8);
//		check and filter odd numbers
//		then find sum of odd numbers
		Integer result=numbers.stream()
				.filter((a)->a%2!=0)
				.reduce(0,(a,b)->(a+b));
		System.out.println(result);		
	}
}
