public class StringManipulation{
	public static String getString(String str) {
		StringBuilder sb=new StringBuilder(str);
		
		if(str.charAt(0)!='j'&& str.charAt(1)!='b') 
		{
			sb.delete(0, 2);
		}
		else if(sb.charAt(0)!='j')
			sb.deleteCharAt(0);
		else if(sb.charAt(1)!='b')
			sb.deleteCharAt(1);
			else 
				sb=sb;
		
		return sb.toString();
	}
	
}


