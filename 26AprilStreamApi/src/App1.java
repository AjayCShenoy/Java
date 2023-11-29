import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class A implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		
		return t>80;
	}
	
}



public class App1 {

	public static void main(String[] args) {
		List<Integer>marks=Arrays.asList(20,35,14,80,99,48,92,89);
		marks.stream()
		.filter((t)->t>80)
		.sorted()
		.forEach(System.out::println);
	}

}



