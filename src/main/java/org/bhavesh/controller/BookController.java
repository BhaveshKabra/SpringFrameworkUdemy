package org.bhavesh.controller;

import org.bhavesh.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/book")
	public String getBooks(Model model)
	{
		model.addAttribute("books", bookService.getAllBooks());
		return "book/list";
	}
}
