package frandrea.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="")
public abstract class BaseController{
	
	private final ApplicationContext applicationContext;
	
	protected BaseController(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	protected ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	
}