/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package com.pesi.model.domain;

/**
 *
 * @project: OracleJavaEE
 * @author kelly
 * @date May 24, 2017 12:26:47 PM
 * 
 */
public class Author {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;
    private boolean wantsSubscription;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isWantsSubscription() {
        return wantsSubscription;
    }

    public void setWantsSubscription(boolean status) {
        this.wantsSubscription = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
