/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package com.pesi.mbeans.services;

import com.pesi.model.domain.Author;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author kelly
 */
@Named(value = "authorService")
@Dependent
public class AuthorService {

    private Author author;
    /**
     * Creates a new instance of AuthorService
     */
    public AuthorService() {
        author = new Author();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void createNewAuthor(){
        
    }
    
    
}

