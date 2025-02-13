package metal.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {


	@GetMapping("/")
	public String showhomepage (Model model) {
		
		return "start";
		
	}
	
	 @GetMapping("/search")
	    public String searchMovies(@RequestParam("mood") String mood, Model model) {
	        // Add the search input value to the model
	        model.addAttribute("searchMood", mood);
	        System.out.println("searchMood");
	        return "print";
	       
	    }

	

}
