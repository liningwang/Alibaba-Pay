package com.yiibai.springsecurity.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class DefaultAccessDeniedHandler implements AccessDeniedHandler {  
	  
    /* (non-Javadoc) 
     * @see org.springframework.security.web.access.AccessDeniedHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.access.AccessDeniedException) 
     */  
    private String errorPage;  
  
    //~ Methods ========================================================================================================  
 
  
    /** 
     * The error page to use. Must begin with a "/" and is interpreted relative to the current context root. 
     * 
     * @param errorPage the dispatcher path to display 
     * 
     * @throws IllegalArgumentException if the argument doesn't comply with the above limitations 
     */  
    public void setErrorPage(String errorPage) {  
    	System.out.println("setErrorPage");
    }

	public void handle(HttpServletRequest arg0, HttpServletResponse arg1, AccessDeniedException arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("handle");
	         
	}  
  
}  
