import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator_ex {
public static void main(String[]args) {
	

	List<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
	Iterator<Integer>it=arr.iterator();
	while(it.hasNext()) {
		 if(it.next()==4)
			System.out.println(it.next());
	}
}
}
