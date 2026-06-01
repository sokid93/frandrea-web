package frandrea.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class HomepageController extends BaseController{
	protected HomepageController(ApplicationContext applicationContext) {
		super(applicationContext);
	}
	
	@GetMapping("home")
	public ModelAndView getHomepage() {
		ModelAndView mav = new ModelAndView("_page/home");
		mav.addObject("title", "Hello World!");
		
		return mav;
	}
}