import java.util.HashMap;
import java.util.Map.Entry;

public class Mapex1 {

	public static void main(String[] args) {
		HashMap<Integer , String>country =new HashMap<>();
		
		country.put(1, "India");
		country.put(3, "South africa");
		country.put(2, "Newzealand");
		country.put(6, "West indies");
		country.put(2, "Australia");
		country.put(8, "Pakistan");
		country.put(4, "England");
		
		for(Entry<Integer,String> e: country.entrySet()) {
			System.out.println(e);
		}
		
		
	}

}
