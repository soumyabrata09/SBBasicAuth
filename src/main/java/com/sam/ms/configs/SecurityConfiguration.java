/**
 * 
 */
package com.sam.ms.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * @author SoumyabrataSen
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("soumyse1@in.ibm.com")
		.password("{noop}General1@").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("POST", "**/auth/login/**")
//		.fullyAuthenticated()
//		.and().httpBasic();
//		
//		http.csrf().disable();
		http.csrf().disable()
		.authorizeRequests()
		//.antMatchers("POST","**/auth/login/**").fullyAuthenticated()
		.anyRequest().fullyAuthenticated()
		.and()
		.httpBasic()
		.authenticationEntryPoint(authEntryPoint);
	}

}
