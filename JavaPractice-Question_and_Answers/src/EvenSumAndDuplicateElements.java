import java.util.LinkedHashSet;
import java.util.Set;

public class EvenSumAndDuplicateElements {

	public static int sumElements(int[] arr) {
		Set<Integer>set=new LinkedHashSet<>();
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) 
			{
			set.add(arr[i]);
			}
		}
		if(set.isEmpty()) {
			return -1;
		}
		else 
		{
			for(int i:set) {
				sum=sum+i;
			}
		}
		
		return sum;
	}

}
