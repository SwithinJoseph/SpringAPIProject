package co.grandcircus.SpringAPIProject.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SwithinController {

	public static String formatDate(String date) {
		String[] date1 = date.split("-");
		
		return date1[1] + "/" + date1[2] + "/" + date1[0];
		
	}
}
