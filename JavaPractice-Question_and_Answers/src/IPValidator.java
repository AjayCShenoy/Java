import java.util.StringTokenizer;

public class IPValidator {

	public static String getIP(String s1) {
		StringTokenizer st=new StringTokenizer(s1,".");
		int count=0;
		while(st.hasMoreTokens())
		{
		
		if(Integer.parseInt(st.nextToken()) <=255)
		{
			count++;
		}
		}
		if(count==4) {
			return "Valid";
		}
		else
			return	"Invalid";
		}
	}
	

