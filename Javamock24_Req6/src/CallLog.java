import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CallLog {
	
	private List<Call> callList;

	public CallLog() {
		
		this.callList=callList;
	}

	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	public  Contact getFavouriteContact()
	{
//		write your code here
//		what input we have ? call list is input
//		what output we find ? contact that has done more calls
		Map<Contact,Integer> map=new LinkedHashMap<Contact,Integer>();
		for(Call call : callList)
		{
			Contact contact=call.getContact();
//			check if this contact is already present in map
			Integer count=map.get(contact);
			if(count==null) {
				count=0;
			}
			count++;
			map.put(contact, count);	
		}
//		find largest count in the map
		int max=0;
		Contact maxCount=null;
		for(Entry<Contact,Integer> e:map.entrySet())
		{
			int count=e.getValue();
			if(count>max)
			{
				max=count;
				maxCount=e.getKey();
				
			}
		}
		return maxCount;
		
	}
	
	 
}
