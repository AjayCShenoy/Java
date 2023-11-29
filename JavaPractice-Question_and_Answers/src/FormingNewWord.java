
public class FormingNewWord {

	public static StringBuffer getformnewword(String s, int n) {
		StringBuffer sb=new StringBuffer();
		if(s.length()>=2*n)
		{
			sb.append(s.substring(0, n)).append(s.substring(s.length()-n));
		}
		
		return sb;
	}
	
}
