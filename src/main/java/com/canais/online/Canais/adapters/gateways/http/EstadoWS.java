package com.canais.online.Canais.adapters.gateways.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class EstadoWS {
	
	public EstadoWS() {}

	@Autowired
    private RestTemplate restTemplate;
	
	public String list() {
		 final String uri = "http://servicodados.ibge.gov.br/api/v1/localidades/estados/";
		    UriComponentsBuilder uriBuilder = UriComponentsBuilder
		            .fromUriString(uri);
		    
		   return restTemplate.getForObject(uriBuilder.toUriString(), String.class);
	}
}
