package co.grandcircus.SpringAPIProject.APIEntitys;

import java.util.ArrayList;

public class MoviePartDeets {
	private double popularity;
	private int id;
	private boolean video;
	private int vote_count;
	private double vote_average;
	private String title;
	private String release_date;
	private String original_language;
	private String original_title;
	private ArrayList<Integer> genre_ids;
	private String backdrop_path;
	private boolean adult;
	private String overview;
	private String poster_path;
	
	public MoviePartDeets() {}

	public MoviePartDeets(double popularity, int id, boolean video, int vote_count, double vote_average, String title,
			String release_date, String original_language, String original_title, ArrayList<Integer> genre_ids,
			String backdrop_path, boolean adult, String overview, String poster_path) {
		super();
		this.popularity = popularity;
		this.id = id;
		this.video = video;
		this.vote_count = vote_count;
		this.vote_average = vote_average;
		this.title = title;
		this.release_date = release_date;
		this.original_language = original_language;
		this.original_title = original_title;
		this.genre_ids = genre_ids;
		this.backdrop_path = backdrop_path;
		this.adult = adult;
		this.overview = overview;
		this.poster_path = poster_path;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVideo() {
		return video;
	}

	public void setVideo(boolean video) {
		this.video = video;
	}

	public int getVote_count() {
		return vote_count;
	}

	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}

	public double getVote_average() {
		return vote_average;
	}

	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public ArrayList<Integer> getGenre_ids() {
		return genre_ids;
	}

	public void setGenre_ids(ArrayList<Integer> genre_ids) {
		this.genre_ids = genre_ids;
	}

	public String getBackdrop_path() {
		return backdrop_path;
	}

	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	@Override
	public String toString() {
		return "MovieFromAPI [popularity=" + popularity + ", id=" + id + ", video=" + video + ", vote_count="
				+ vote_count + ", vote_average=" + vote_average + ", title=" + title + ", release_date=" + release_date
				+ ", original_language=" + original_language + ", original_title=" + original_title + ", genre_ids="
				+ genre_ids + ", backdrop_path=" + backdrop_path + ", adult=" + adult + ", overview=" + overview
				+ ", poster_path=" + poster_path + "]";
	}
}
