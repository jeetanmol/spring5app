/**
 * 
 */
package com.example.spring5app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5app.models.Author;
import com.example.spring5app.models.Book;
import com.example.spring5app.models.Publisher;
import com.example.spring5app.repositories.AuthorRepository;
import com.example.spring5app.repositories.BookRepository;
import com.example.spring5app.repositories.PublisherRepository;

/**
 * @author anmvirk
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Publisher publisher1 = new Publisher("publisher1", "line1", "line2", "Gurugram", "HR", "IN");
		Author author1 = new Author("firstName1", "lastName1");
		Book book1 = new Book("book1", "7429827832");
		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);

		authorRepository.save(author1);
		bookRepository.save(book1);
		Author author2 = new Author("firstName2", "lastName2");
		Book book2 = new Book("book2", "7429827832");
		author2.getBooks().add(book2);
		book2.getAuthors().add(author2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
		
		publisher1.getBooks().add(book1);
		publisher1.getBooks().add(book2);
		
		publisherRepository.save(publisher1);
		System.out.println("No of books assigned" + publisherRepository.count());
	}

}
