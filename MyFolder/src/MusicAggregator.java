import java.util.Date;

public class MusicAggregator {
	private String title;
    private String genre;
    private Date duration;
    private Double rating;
    
	public MusicAggregator(){}

	public MusicAggregator(String title, String genre, Date duration, Double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MusicAggregator [title=" + title + ", genre=" + genre + ", duration=" + duration + ", rating=" + rating
				+ "]";
	}
	
	
    
    
}
