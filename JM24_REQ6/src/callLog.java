import java.util.List;

public class callLog {

	private  List<Call> callList;

	public callLog() {
		super();
	}

	public callLog(List<Call> callList) {
		super();
		this.callList = callList;
	}

	public List<Call> getCallList() {
		return callList;
	}

	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	Contact getFavouriteContact(){
		return null;
		
	}
}
