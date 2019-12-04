package co.grandcircus.SpringAPIProject.repos;

public class WListEntry {
	String title;
	String genre;
	int year;
	
	public WListEntry() {}

	public WListEntry(String title, String genre, int year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
