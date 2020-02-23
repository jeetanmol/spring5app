/**
 * 
 */
package com.example.spring5app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5app.models.Publisher;

/**
 * @author anmvirk
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
