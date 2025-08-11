package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookList;
import com.bookstore.service.BookService;
import com.bookstore.service.MyBookListService;

@Controller
//@RequestMapping("/products")
public class BookController {


	public BookController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookListService myBookService;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBooks() {
		List<Book> list = service.getAllBooks();
		
		/* ModelAndView m = new ModelAndView();
		   m.setViewName("bookList");
		   m.addObject("book",list);
		*/   
		return new ModelAndView("bookList","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		
		System.out.println("IMPRIMIENDO LIBRO A salvar"+b.toString());
		
		service.save(b);
		return "redirect:/available_books";
	}
	
	@PostMapping("/save1")
	public String addBookEdited(@ModelAttribute Book b) {
		
		service.save(b);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks(Model model) {
		List<MyBookList> list = myBookService.getAllMyBooks();
		model.addAttribute("book",list);
		return "myBooks";
	}
	
	@RequestMapping("mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book book = service.getBookById(id);
		MyBookList mb = new MyBookList(book.getId(),book.getName(),book.getAuthor(),book.getPrice());
				
        myBookService.saveMyBooks(mb);
		return "redirect:/my_books";
	}
	
	@RequestMapping("editBook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		Book book = service.getBookById(id);
		
		System.out.println("IMPRIMIENDO LIBRO A EDITAR"+book.toString());
		
		model.addAttribute("book",book);
		return "bookEdit";
	}
	
	 @RequestMapping("/deleteBook/{id}")
	 public String deleteBook(@PathVariable("id") int id) {
		 service.deleteById(id);
		 return "redirect:/available_books"; 
	 }
	 
}
