import java.util.List;
import java.util.Map;

public class UserScore {
	private Double completionPercentage;
	private User user;
	private Course course;
	
	public UserScore() {
		super();
	}
	
	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}
	
	public Double getCompletionPercentage() {
		return completionPercentage;
	}
	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	static Map<String,UserScore>getTopPerformer(List<UserScore> scoreList)
	{
//		write code here ..
		
		static Map<String,UserScore>getTopPerformer(List<UserScore>scoreList){
			Map<String, UserScore>ans=new TreeMap<>();
			for(UserScore userScore:scoreList) {
				UserScore res=ans.get(userScore.getCourse().getName());
				if(res==null) {//courseName is not present
				ans.put(userScore.getCourse().getName(),userScore );
			}
			else 
			{
				if(userScore.getCompletionPercentage()>res.getCompletionPercentage()) {
				ans.put(userScore.getCourse().getName(), userScore);
					}
				}

			}
			return ans;
			}
		
		}
	}


