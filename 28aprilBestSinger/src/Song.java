import java.util.Date;
import java.util.List;

public class Song {

	private String title;
	private String genre;
	private Date duration;
	private double rating;
	private List<Artist> artistList;
	
	public Song() {
		super();
	}

	public Song(String title, String genre, Date duration, double rating, List<Artist> artistList) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
		this.artistList = artistList;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Artist> getArtistList() {
		return artistList;
	}

	public void setArtistList(List<Artist> artistList) {
		this.artistList = artistList;
	}
	
	
	
	
	
	

}
