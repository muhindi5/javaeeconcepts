/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package com.pesi.mbeans.services;

import com.pesi.model.domain.Author;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author kelly
 */
@Named(value = "authorService")
@SessionScoped
public class AuthorService implements Serializable{

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

    public String createNewAuthor(){
        return "summary";
    }
    
    
}

