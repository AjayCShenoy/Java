import java.util.ArrayList;
import java.util.List;

public class Remove10s {
	
	public static List<Integer> removeTens(int n,int arr[]) {
		List<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) 
		{
			if(arr[i]!=10) 
			{
		    list.add(arr[i]);
			}
			
		}
		if(list.size()!=n)
		{
			n=n-list.size();
		}
		for(int j=0;j<n;j++) {
			list.add(0);
		}
		return list;
	}
}
