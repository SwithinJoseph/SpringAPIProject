package co.grandcircus.SpringAPIProject.APIEntitys;

import java.util.ArrayList;

public class MovieFullDeets {
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
	private ArrayList<ProdCoPartDeets> production_companies;
	private ArrayList<ProdCountry> production_countries;
	private ArrayList<SpokenLanguage> spoken_languages;
	private String status;
	private String tagline;
	public MovieFullDeets(double popularity, int id, boolean video, int vote_count, double vote_average, String title,
			String release_date, String original_language, String original_title, ArrayList<Integer> genre_ids,
			String backdrop_path, boolean adult, String overview, String poster_path,
			ArrayList<ProdCoPartDeets> production_companies, ArrayList<ProdCountry> production_countries,
			ArrayList<SpokenLanguage> spoken_languages, String status, String tagline) {
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
		this.production_companies = production_companies;
		this.production_countries = production_countries;
		this.spoken_languages = spoken_languages;
		this.status = status;
		this.tagline = tagline;
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
	public ArrayList<ProdCoPartDeets> getProduction_companies() {
		return production_companies;
	}
	public void setProduction_companies(ArrayList<ProdCoPartDeets> production_companies) {
		this.production_companies = production_companies;
	}
	public ArrayList<ProdCountry> getProduction_countries() {
		return production_countries;
	}
	public void setProduction_countries(ArrayList<ProdCountry> production_countries) {
		this.production_countries = production_countries;
	}
	public ArrayList<SpokenLanguage> getSpoken_languages() {
		return spoken_languages;
	}
	public void setSpoken_languages(ArrayList<SpokenLanguage> spoken_languages) {
		this.spoken_languages = spoken_languages;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	
	
}
