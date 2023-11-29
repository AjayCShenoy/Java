import java.util.Map;

public class StatesandCapitals {

	public static String getcapital(Map<String, String> map, String state) {
		String result=new String();
		
		for(Map.Entry e:map.entrySet())
		{
			if(e.getKey().equals(state))
			{
				result=e.getValue()+"$"+e.getKey();
			}
		}
		return result;
	}
	
}
