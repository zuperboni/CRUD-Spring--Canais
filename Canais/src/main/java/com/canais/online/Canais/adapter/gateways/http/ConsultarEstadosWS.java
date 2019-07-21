/**
 * 
 */
package com.canais.online.Canais.adapter.gateways.http;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.canais.online.Canais.adapter.gateways.ConsultarEstadosGateway;
import com.canais.online.Canais.domain.Estado;

/**
 * @author monica.dos.santos
 *
 */
public class ConsultarEstadosWS{


	
	public List<Estado> consultarEstados() {
		RestTemplate restTemplate = new RestTemplate();
		List<Estado> estados = (List<Estado>) restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados/",Estado.class);
		return estados;
	}

}
