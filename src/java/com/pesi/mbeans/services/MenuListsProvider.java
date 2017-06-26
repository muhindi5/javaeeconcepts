/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package com.pesi.mbeans.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author kelly
 */
@Named(value = "lists")
@Dependent
public class MenuListsProvider {

//    private List<String> genderOptions;
    private String[] genderOptions = {"Male","Female","Bisexual","Transgender"};
    
    public MenuListsProvider() {
    }
    
    @PostConstruct
    public void initLists(){
//        genderOptions = new ArrayList<>();
//        genderOptions.addAll(Arrays.asList(genderOptions));
    }
//
//    public List<String> getGenderOptions() {
//        return genderOptions;
//    }
//
//    public void setGenderOptions(List<String> genderOptions) {
//        this.genderOptions = genderOptions;
//    }

    //returns menu list as array, list can also be used
    public String[] getGenderOptions() {
        return genderOptions;
    }

    public void setGenderOptions(String[] genderOptions) {
        this.genderOptions = genderOptions;
    }
    
    
}
