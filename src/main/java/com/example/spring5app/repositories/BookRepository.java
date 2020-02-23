/**
 * 
 */
package com.example.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5app.models.Book;

/**
 * @author anmvirk
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
