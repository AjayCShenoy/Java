public class PalindromeAndVowel {

	public static String checkPalin(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		int vowels=0;
		if(str.equals(sb.toString()))
		{
		for(int j=0;j<str.length();j++) {
		if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u') {
					vowels++;
				}
			}
		}
		if(vowels>=2)
		{
			return "Valid";
		}
		else 
		{
			return "Invalid";
		}
	}
}
