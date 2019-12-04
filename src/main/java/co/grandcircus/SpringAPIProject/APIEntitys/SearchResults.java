package co.grandcircus.SpringAPIProject.APIEntitys;

import java.util.ArrayList;

public class SearchResults {
	private int page;
	private int total_results;
	private int totalPages;
	private ArrayList<MovieFromAPI> results;
	
	public SearchResults() {}

	public SearchResults(int page, int total_results, int totalPages, ArrayList<MovieFromAPI> results) {
		super();
		this.page = page;
		this.total_results = total_results;
		this.totalPages = totalPages;
		this.results = results;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal_results() {
		return total_results;
	}

	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public ArrayList<MovieFromAPI> getResults() {
		return results;
	}

	public void setResults(ArrayList<MovieFromAPI> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "SearchResults [page=" + page + ", total_results=" + total_results + ", totalPages=" + totalPages
				+ ", results=" + results + "]";
	}
}
