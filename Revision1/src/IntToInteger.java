import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

			//  convert int array to arraylist

public class IntToInteger {

	public static void main(String[] args) {
		
		int[] intArray = {10,20,30,40};
		List<Integer> integerArray = Arrays.stream(intArray)
				.boxed()
				.collect(Collectors.toList());
	
		System.out.println(integerArray);
	}
}
