package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService myBookService1;
	
	 @RequestMapping("/deleteMylist/{id}")
	 public String deleteMyList(@PathVariable("id") int id) {
		 myBookService1.deleteById(id);
		 return "redirect:/my_books"; 
	 }
}
