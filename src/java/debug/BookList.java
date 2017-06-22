/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package debug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author kelly
 */
@Named(value = "bookList")
@SessionScoped
public class BookList implements Serializable{

    private List<String> books;
    private String selected;
    /**
     * Creates a new instance of BookList
     */
    public BookList() {
        books = new ArrayList();
    }
    
    @PostConstruct
    public void populateList(){
        books.add("The Genealogy of Morals");
        books.add("Beyond Good and Evil");
        books.add("Ecce Homo");
        books.add("The Case of Wagner");
        books.add("This spoke Zarathustra");
        books.add("The Antichrist");
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
    
    public String getMojarraVersion(){
        return "Version: "+FacesContext.class.getPackage().getImplementationVersion() + 
                "Title: "+FacesContext.class.getPackage().getImplementationTitle(); 
    }
    
    
}
