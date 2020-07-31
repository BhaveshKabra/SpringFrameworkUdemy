package org.bhavesh.repository;

import org.bhavesh.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{
	
}
