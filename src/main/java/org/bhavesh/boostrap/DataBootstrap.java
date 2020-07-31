package org.bhavesh.boostrap;

import org.bhavesh.domain.Author;
import org.bhavesh.domain.Book;
import org.bhavesh.domain.Publisher;
import org.bhavesh.repository.AuthorRepository;
import org.bhavesh.repository.BookRepository;
import org.bhavesh.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBootstrap implements CommandLineRunner {

	private final AuthorRepository authorRepository;	
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	@Autowired 
	public DataBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository=publisherRepository;
	}
	 
	@Override
	public void run(String... args) throws Exception 
	{
		 Author author1=new Author("Test1","test1");
		 Book book1= new Book("Book Title", "188ghtio643");
		 author1.getBooks().add(book1);
		 book1.getAuthors().add(author1);
		 Publisher publisher1=new Publisher("Somename", "Soemaddress", "SomeCity", "Somestate", 1224);
		 
		 authorRepository.save(author1);
		 bookRepository.save(book1);
		 book1.setPublisher(publisher1);
		 publisher1.getBooks().add(book1);
		 publisherRepository.save(publisher1);
		 
		 Author author2=new Author("Test2","test2");
		 Book book2= new Book("Book Title2", "2188ghtio643");
		 author2.getBooks().add(book2);
		 book2.getAuthors().add(author2);

		 book2.setPublisher(publisher1);
		 publisher1.getBooks().add(book2);
		 
		 authorRepository.save(author2);
		 bookRepository.save(book2);
		 System.out.println("Boostrapped in");
	}
}
