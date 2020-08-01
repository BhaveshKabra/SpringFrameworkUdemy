package org.bhavesh.controller;

import org.bhavesh.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

	private final AuthorService authorservice;

	public AuthorController(AuthorService authorservice) {
		super();
		this.authorservice = authorservice;
	}
	
	@RequestMapping("/author")
	public String getAllAuthor(Model model)
	{
		model.addAttribute("authors", authorservice.getAuthors());
		return "author/list";
	}
}
