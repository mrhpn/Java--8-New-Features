package assignment_streamsAPI;

public class Movie {
	private String title;
	private int likes;

	public Movie(String title, int likes) {
		super();
		this.title = title;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
