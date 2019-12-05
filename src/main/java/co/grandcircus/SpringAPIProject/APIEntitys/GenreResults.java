package co.grandcircus.SpringAPIProject.APIEntitys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GenreResults {
	private ArrayList<Genre> genres;
	private Map<Integer,String> genreMap;
	public GenreResults() {}
	public GenreResults(ArrayList<Genre> genres) {
		super();
		this.genres = genres;
	}
	public ArrayList<Genre> getGenres() {
		return genres;
	}
	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}
	public void initGenreMap() {
		genreMap = new HashMap<Integer,String>();
		for (Genre g : genres) {
			genreMap.put(g.getId(),g.getName());
		}
	}
	public String getGenreById(int id) {
		return genreMap.get(id);
	}
}
