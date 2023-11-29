
public class StringProcessing {
	public static boolean isEqual(String s1, String s2, int n) {
	String str1=s1.toLowerCase();
	String str2=s2.toLowerCase();
	if(str1.charAt(n-1)==str2.charAt(str2.length()-n))
		return true;
	else
		return false;
	}

}
