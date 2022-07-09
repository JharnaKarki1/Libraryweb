package edu.mum.cs.cs425.elibrary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.elibrary.model.Publisher;
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
//	 @GetMapping(value = {"/new"})
//	    public String displayNewPublisherForm() {
//		 
//	        return "publisher/new";
//	 }
	 
	 @GetMapping(value = {"/new"})
	    public String displayNewPublisherForm(Model model) {
	        var newPublisher = new Publisher();
	        model.addAttribute("publisher", newPublisher);
	        return "publisher/new";
	    }
	 @PostMapping(value = {"/new"}) // PRG: Post-Redirect-Get
	    public String addNewPublisher(Publisher publisher) {
	       
	           
	            return "redirect:/publisher/list";
	 }
	    

}
