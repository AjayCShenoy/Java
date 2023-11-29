import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AppMobile {
	public static void main(String[]args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Mobile>mobileList=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String details=sc.nextLine();
			if(details.equals("")) {
				details=sc.nextLine();
				
			}
			Mobile mobile=Mobile.createMobile(details);
			mobileList.add(mobile);
			
		}
		Map<Date, Integer> result = Mobile.yearWiseCount(mobileList);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
		System.out.format("%-15s %s\n","Year","No. of Mobiles");
		for(Entry<Date, Integer> e:result.entrySet())
			System.out.format("%-15s %s\n",sdf.format(e.getKey()),e.getValue());
		
	}

}
