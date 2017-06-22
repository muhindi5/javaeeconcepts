/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package com.pesi.mbeans.services;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kelly
 */
@Named(value = "auth")
@SessionScoped
public class AuthenticationService implements Serializable {

    /**
     * Creates a new instance of AuthenticationService
     */
    private String userName;
    private String password;
    
    public AuthenticationService() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
