package co.grandcircus.SpringAPIProject.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SwithinController {

	public static String formatDate(String date) {
		String year = date.substring(0, 4);
		String month = date.substring(4, 6);
		String day = date.substring(6);
		return month + "/" + day + "/" + year;
		
	}
}
