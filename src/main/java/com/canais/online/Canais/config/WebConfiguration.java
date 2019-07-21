/**
 * 
 */
package com.canais.online.Canais.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author monica.dos.santos
 *
 */
@Configuration
@EnableWebSecurity
public class WebConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {

     http.authorizeRequests().antMatchers("/h2-console/*").permitAll();


        http.csrf().disable();
        http.headers().frameOptions().sameOrigin();
    }
    
}
