/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.demojee7;

import java.io.Serializable;
import java.util.Date;
import javax.ejb.BeforeCompletion;
import javax.inject.Named;

/**
 *
 * @author cesar
 */
@Named
public class demoController implements Serializable{
    
    private String var1;
    private Date var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public Date getVar2() {
        return var2;
    }

    public void setVar2(Date var2) {
        this.var2 = var2;
    }
    
    
}
