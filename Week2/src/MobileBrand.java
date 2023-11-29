import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileBrand {
	private String name;
	private List<Mobile>mobileList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	
	public MobileBrand() {
		mobileList=new ArrayList<Mobile>();
		
	}
	public MobileBrand(String name, List<Mobile> mobileList) {
		
		this.name = name;
		this.mobileList = mobileList;
	}
	
	public void addMobileToMobileBrand(Mobile mobile) {
		mobileList.add(mobile);
		
	}
	
	public Boolean removeMobileFromMobileBrand(String referenceId) {
		return false;
		
		
	}
	public void displayMobiles() {
		System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price","Launched Date");
		Iterator<Mobile> it=mobileList.iterator();
		
	}
	
	
	}


