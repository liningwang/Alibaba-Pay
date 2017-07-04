package com.yiibai.springsecurity.configuration;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class LoginFailureHandler implements AuthenticationFailureHandler {

    public LoginFailureHandler() {
    	System.out.println("LoginFailureHandler");
    }

	public void onAuthenticationFailure(HttpServletRequest arg0, HttpServletResponse arg1, AuthenticationException arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("onAuthenticationFailure");
	}

}