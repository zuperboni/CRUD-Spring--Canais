package com.canais.online.Canais.adapters.gateways.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CEPWS {

	public CEPWS() {}
	
	@Autowired
    private RestTemplate restTemplate;
	
    public String findById(String CEP) {
        final String uri = "https://viacep.com.br/ws/"+ CEP +"/json";
        System.out.println(uri);
		    UriComponentsBuilder uriBuilder = UriComponentsBuilder
		            .fromUriString(uri);
		    
		   return restTemplate.getForObject(uriBuilder.toUriString(), String.class);
        }

}
