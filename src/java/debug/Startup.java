/*
 *  Bitforge Software Labs
 *  (c)2017 
 *  http://bitforge.co.ke
 *  <muhindi@bitforge.co.ke><muhindi09@gmail.com>
 */
package debug;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author kelly
 */
@ManagedBean
@javax.ejb.Startup
@ApplicationScoped
public class Startup {
    
    private String var1;
    private int token;

    /**
     * Creates a new instance of Startup
     */
    public Startup() {
        Logger.getAnonymousLogger().log(Level.INFO,"Starting application");
    }
    
    @PostConstruct
    public void init(){
        Logger.getAnonymousLogger().log(Level.INFO,"Inside postconstruct");
        var1="user2";
        token = new Random().nextInt(10000);
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }
}
