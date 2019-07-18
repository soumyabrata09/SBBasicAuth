/**
 * 
 */
package com.sam.ms.configs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * @author SoumyabrataSen
 *
 */
@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest req , HttpServletResponse res , AuthenticationException ex) throws IOException,ServletException{
		res.addHeader("WWW-Authenticate", "Basic realm="+getRealmName());
		res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		PrintWriter writer = res.getWriter();
		writer.println("HTTP status 401 - " + ex.getMessage());
	}
	
	@Override 
	public void afterPropertiesSet() throws Exception{
		setRealmName("sam.ms");
		super.afterPropertiesSet();
	}
}
