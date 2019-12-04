package co.grandcircus.SpringAPIProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.SpringAPIProject.APIEntitys.MovieFullDeets;
import co.grandcircus.SpringAPIProject.APIEntitys.SearchResults;

@Controller
public class RobController {
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("find-movie")
	public ModelAndView findMovie(String title, int year) {
		
		String url = "https://api.themoviedb.org/3/search/movie?api_key=00ca39625dd2a729ed49da20319b6e7a&query="
		+ title
		+"&year=" + year;
		SearchResults results = rt.getForObject(url, SearchResults.class);
		
		System.out.println(results);
		ModelAndView mv = new ModelAndView("search-results","results", results);
		return mv;
	}
	
	@RequestMapping("show-movie-details")
	public ModelAndView showMovieFromResults(int id) {
		String url = "https://api.themoviedb.org/3/movie/" + id + "?api_key=00ca39625dd2a729ed49da20319b6e7a";
		MovieFullDeets movie = rt.getForObject(url, MovieFullDeets.class);
		ModelAndView mv = new ModelAndView("movie-details","details", movie);
		return mv;
	}
	
	
	
}
