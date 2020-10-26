/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HCY
 */

package com.Example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
        
public class DisplayMessage extends SimpleTagSupport{
    
   @Override
    
    public void doTag() throws JspException, IOException{
        
        super.doTag();
        
        JspWriter out=getJspContext().getOut();
        
        out.print("Hello User !");
    }
    
}
