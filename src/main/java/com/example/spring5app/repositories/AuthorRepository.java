/**
 * 
 */
package com.example.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5app.models.Author;

/**
 * @author anmvirk
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
