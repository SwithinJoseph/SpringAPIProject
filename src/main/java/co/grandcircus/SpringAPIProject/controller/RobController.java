package co.grandcircus.SpringAPIProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.APIEntitys.Genre;
import co.grandcircus.SpringAPIProject.APIEntitys.GenreResults;
import co.grandcircus.SpringAPIProject.APIEntitys.MovieFullDeets;
import co.grandcircus.SpringAPIProject.APIEntitys.SearchResults;
import co.grandcircus.SpringAPIProject.repos.WListEntry;
import co.grandcircus.SpringAPIProject.repos.WListRepo;

@Controller
public class RobController {
	RestTemplate rt = new RestTemplate();

	@Autowired
	WListRepo watchlistRepo;
	

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("find-movie")
	public ModelAndView findMovie(String title, Integer year) {
		String url = "https://api.themoviedb.org/3/search/movie?api_key=00ca39625dd2a729ed49da20319b6e7a&query=" + title
				+ "&year=" + year;
		SearchResults results = rt.getForObject(url, SearchResults.class);

		ModelAndView mv = new ModelAndView("search-results", "results", results);
		return mv;
	}

	@RequestMapping("show-movie-details")
	public ModelAndView showMovieFromResults(int id) {
		MovieFullDeets movie = getMovieByID(id);
		ModelAndView mv = new ModelAndView("movie-details", "details", movie);

		ArrayList<String> genreStrings = new ArrayList<>();
		for (Genre g : movie.getGenres()) {
			genreStrings.add(g.getName());
		}
		String genreTitle = (genreStrings.size() > 1) ? "Genres" : "Genre";
		mv.addObject("genreTitle", genreTitle);
		mv.addObject("genres", genreStrings);
		
		mv.addObject("date", SwithinController.formatDate(movie.getRelease_date()));
		return mv;
	}

	@RequestMapping("add-to-watchlist")
	public ModelAndView addToWatchlist(int id) {
		WListEntry entry = new WListEntry(getMovieByID(id));
		System.out.println(watchlistRepo.findMovieInWList(id));
		if (watchlistRepo.findMovieInWList(id).size() == 0) {
			watchlistRepo.save(entry);
			return showWListConfirmation(id, entry.getTitle(), false);
		} else {
			return showWListConfirmation(id, entry.getTitle(), true);
		}
		//return new ModelAndView("redirect:/show-movie-details?id=" + id);
	}

	@RequestMapping("show-watchlist")
	public ModelAndView showWatchlist() {
		List<WListEntry> watchlist = watchlistRepo.findAll();
		return new ModelAndView("watch-list", "watchlist", watchlist);
	}
	
	@RequestMapping("delete-from-watchlist")
	public ModelAndView deleteFromWatchlist(int listId){
		watchlistRepo.deleteById(listId);
		return new ModelAndView("redirect:/show-watchlist");
	}
	
	@RequestMapping("show-wlist-confirmation")
	public ModelAndView showWListConfirmation(int movieId, String movieTitle, boolean alreadyInList){
		ModelAndView mv = new ModelAndView("watch-list-confirmation");
		
		String message = alreadyInList ? movieTitle + " is already in your watchlist!" : "Successfully added " + movieTitle + "!";
		mv.addObject("message", message);
		
		mv.addObject("id", movieId);
		
		return mv;
	}

	private MovieFullDeets getMovieByID(int id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=00ca39625dd2a729ed49da20319b6e7a";
		return rt.getForObject(url, MovieFullDeets.class);
	}
}
