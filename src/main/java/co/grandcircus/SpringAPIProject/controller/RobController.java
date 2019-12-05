package co.grandcircus.SpringAPIProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.APIEntitys.MovieFullDeets;
import co.grandcircus.SpringAPIProject.APIEntitys.GenreResults;
import co.grandcircus.SpringAPIProject.APIEntitys.SearchResults;
import co.grandcircus.SpringAPIProject.repos.WListEntry;
import co.grandcircus.SpringAPIProject.repos.WListRepo;

@Controller
public class RobController {
	RestTemplate rt = new RestTemplate();

	@Autowired
	WListRepo watchlistRepo;
	
	GenreResults genres;

	@RequestMapping("/")
	public ModelAndView home() {
		if (genres==null) {
			String url = " https://api.themoviedb.org/3/genre/movie/list?api_key=00ca39625dd2a729ed49da20319b6e7a&language=en-US";
			genres=rt.getForObject(url, GenreResults.class);
			genres.initGenreMap();
		}
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
		for (int i : movie.getGenre_ids()) {
			genreStrings.add(genres.getGenreById(i));
		}
		mv.addObject("genres", genreStrings);
		
		mv.addObject("date", SwithinController.formatDate(movie.getRelease_date()));
		return mv;
	}

	@RequestMapping("add-to-watchlist")
	public ModelAndView addToWatchlist(int id) {
		if (watchlistRepo.findMovieInWList(id).size() == 0) {
			watchlistRepo.save(new WListEntry(getMovieByID(id)));
		} else {
			System.out.println("Movie already in watchlist!");
		}
		return new ModelAndView("redirect:/show-movie-details?id=" + id);
	}

	@RequestMapping("show-watchlist")
	public ModelAndView showWatchlist() {
		List<WListEntry> watchlist = watchlistRepo.findAll();
		return new ModelAndView("watch-list", "watchlist", watchlist);
	}

	private MovieFullDeets getMovieByID(int id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=00ca39625dd2a729ed49da20319b6e7a";
		return rt.getForObject(url, MovieFullDeets.class);
	}
}
