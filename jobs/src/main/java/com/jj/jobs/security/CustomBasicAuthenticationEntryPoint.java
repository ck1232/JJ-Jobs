package com.jj.jobs.security;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

public class CustomBasicAuthenticationEntryPoint extends BasicAuthenticationEntryPoint{
	private static final Logger logger = Logger.getLogger(CustomBasicAuthenticationEntryPoint.class);
	@Override
    public void commence(final HttpServletRequest request, 
            final HttpServletResponse response, 
            final AuthenticationException authException) throws IOException, ServletException {
        //Authentication failed, send error response.
        response.setStatus(HttpServletResponse.SC_NOT_ACCEPTABLE);
        response.addHeader("WWW-Authenticate", "Basic realm=" + getRealmName() + "");
        
        logger.info(authException.getMessage());
        PrintWriter writer = response.getWriter();
        writer.println("HTTP Status 406 : Please try again.");
    }
     
    @Override
    public void afterPropertiesSet() throws Exception {
        setRealmName("REALM");
        super.afterPropertiesSet();
    }
}
