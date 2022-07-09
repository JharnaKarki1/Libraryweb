package edu.mum.cs.cs425.elibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.elibrary.service.PublisherService;
@Controller
@RequestMapping(value ={"/publisher"})
public class PublisherController {
	  @Autowired
	    private PublisherService publisherService;
	  
	 @GetMapping(value = {"/list"})
	    public ModelAndView listPublisher() {
		 var publishers = publisherService.getAllPublishers();
	        var modelAndView = new ModelAndView();
	        modelAndView.addObject("publishers", publishers);
	        modelAndView.setViewName("publisher/list");
	        return modelAndView;
	    }

}
