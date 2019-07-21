package com.canais.online.Canais.adapters.gateways.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MunicipioWS {

	public MunicipioWS() {}
	
	@Autowired
    private RestTemplate restTemplate;
	
    public String list(int id) {
        final String uri = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/"+ id +"/municipios";
        System.out.println(uri);
		    UriComponentsBuilder uriBuilder = UriComponentsBuilder
		            .fromUriString(uri);
		    
		   return restTemplate.getForObject(uriBuilder.toUriString(), String.class);
        }

}
