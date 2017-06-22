/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */

package com.pesi.mbeans.utils.listeners;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @project: OracleJavaEE
 * @author kelly
 * @date Jun 19, 2017 5:04:07 PM
 * 
 */
public class NameChange implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
         Logger.getAnonymousLogger().log(Level.INFO, "Value= {0}",event.getNewValue().toString());
    }

}
