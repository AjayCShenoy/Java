import java.util.HashSet;

public class HashsetCountryExample {

	public static void main(String[] args) {
		HashSet<String>country=new HashSet<String>();
		
		country.add("India");
		country.add("UK");
		country.add("Canada");
		country.add("India");
		country.add("India");
		country.add("Japan");
		country.add("Rome");
		
		System.out.println(country);
	}

}
