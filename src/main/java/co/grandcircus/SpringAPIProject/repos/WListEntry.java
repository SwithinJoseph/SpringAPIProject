package co.grandcircus.SpringAPIProject.repos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.grandcircus.SpringAPIProject.APIEntitys.MovieFullDeets;
import co.grandcircus.SpringAPIProject.APIEntitys.MoviePartDeets;

@Entity
@Table(name="MovieWatchlist")
public class WListEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String overview;
	private int year;
	
	private int movie_id;

	public WListEntry() {}
	
	public WListEntry(String title, String overview, int year, int movie_id) {
		super();
		this.title = title;
		this.overview = overview;
		this.year = year;
		this.movie_id = movie_id;
	}
	
	public WListEntry(MovieFullDeets movie) {
		super();
		this.title = movie.getTitle();
		this.overview = movie.getOverview();
		String releaseDate = movie.getRelease_date();
		this.year = Integer.valueOf(releaseDate.substring(0,4));
		this.movie_id = movie.getId();
	}

	public WListEntry(Integer id, String title, String overview, int year, int movie_id) {
		super();
		this.id = id;
		this.title = title;
		this.overview = overview;
		this.year = year;
		this.movie_id = movie_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	@Override
	public String toString() {
		return "WListEntry [id=" + id + ", title=" + title + ", overview=" + overview + ", year=" + year + ", movie_id="
				+ movie_id + "]";
	}
}
