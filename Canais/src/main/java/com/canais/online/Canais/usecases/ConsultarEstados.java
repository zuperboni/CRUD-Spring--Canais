/**
 * 
 */
package com.canais.online.Canais.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.canais.online.Canais.adapter.gateways.ConsultarEstadosGateway;
import com.canais.online.Canais.domain.Estado;

/**
 * @author monica.dos.santos
 *
 */

public class ConsultarEstados implements ConsultarEstadosGateway {

	private final ConsultarEstadosGateway estadosGateway;
	/**
	 * 
	 */
	public ConsultarEstados(final ConsultarEstadosGateway estadosGateway) {
		this.estadosGateway = estadosGateway;
	}

/*	public List<Estado> execute(){
		
		final List<Estado> estados = estadosGateway.consultarEstados();
		
		//log.info("Lista de estados recebidos: {}",estados);
		return estados;
	}*/

	@Override
	public List<Estado> consultarEstados() {
		RestTemplate restTemplate = new RestTemplate();
		List<Estado> estados = (List<Estado>) restTemplate.getForEntity("https://servicodados.ibge.gov.br/api/v1/localidades/estados/",Estado.class);
		return estados;
	}
}
