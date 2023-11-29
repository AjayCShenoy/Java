
public class StringPmethod {
	static String getCombo(String str1, String str2) {
		if(str1.length()>str2.length())
		{
			return str1+str2+str1;
		}
		else
			return str1+str2+str2;
	}
}

