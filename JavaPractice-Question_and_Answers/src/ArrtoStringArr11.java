import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrtoStringArr11 {

	public static String[] convertToStringArray(List<String> list) {
		Collections.sort(list);
		String[]s=new String[list.size()];
		list.toArray(s);
		return s;
	
	}	
}
