package org.bhavesh.service;

import java.util.ArrayList;
import java.util.List;

import org.bhavesh.domain.Book;
import org.bhavesh.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	public final BookRepository bookrepo;

	public BookService(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	public List<Book> getAllBooks()
	{
		List<Book> list=new ArrayList<Book>();
		Iterable<Book> iter=bookrepo.findAll();
		iter.forEach(b -> list.add(b));
		return list;
	}
}
