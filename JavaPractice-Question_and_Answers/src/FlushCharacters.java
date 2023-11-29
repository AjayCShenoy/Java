
public class FlushCharacters {

	public static String getSpecialChar(String s) {
		String str1=new String();
			str1=s.replaceAll("[a-zA-Z]", "");
		return str1;
	}

}
