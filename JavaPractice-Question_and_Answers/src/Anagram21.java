import java.util.Arrays;

public class Anagram21 {

	public static String getAnagram(String s1, String s2) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String str1=new String(arr1);
		String str2=new String(arr2);
		
		if(str1.equals(str2)) {
			return "Anagrams";
		}
		else
		return "Not Anagrams";
	}

}
