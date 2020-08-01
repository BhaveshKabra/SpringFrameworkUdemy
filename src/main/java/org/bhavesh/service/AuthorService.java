package org.bhavesh.service;

import java.util.ArrayList;
import java.util.List;

import org.bhavesh.domain.Author;
import org.bhavesh.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	
	public final AuthorRepository authorrepo;

	public AuthorService(AuthorRepository authorrepo) {
		super();
		this.authorrepo = authorrepo;
	}
	
	public List<Author> getAuthors()
	{
		List<Author> list= new ArrayList<Author>();
		Iterable <Author>iter=authorrepo.findAll();
		iter.forEach( author -> list.add(author));
		return list;
	}
}
