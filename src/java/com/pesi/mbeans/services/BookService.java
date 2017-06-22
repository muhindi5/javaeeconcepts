/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package com.pesi.mbeans.services;

import com.pesi.model.domain.Author;
import com.pesi.model.domain.Book;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kelly
 */
@Named(value = "bookService")
@SessionScoped
public class BookService implements Serializable {

    /**
     * Creates a new instance of BookService
     */
    
    private Book book;
    private Author author;
    
    public BookService() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String createBook(){
        return "createbook";
    }
    
        
}
