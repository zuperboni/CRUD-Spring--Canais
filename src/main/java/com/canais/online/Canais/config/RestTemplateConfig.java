/**
 * 
 */
package com.canais.online.Canais.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author monica.dos.santos
 *
 */
@Configuration
@ComponentScan(basePackageClasses = { RestTemplateConfig.class })
public class RestTemplateConfig {
    @Autowired
    WebConfiguration webConfiguration;
	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
