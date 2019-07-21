/**
 * 
 */
package com.canais.online.Canais.adapter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canais.online.Canais.domain.Estado;
import com.canais.online.Canais.usecases.ConsultarEstados;

/**
 * @author monica.dos.santos
 *
 */
@RestController
public class EstadoController {

	private ConsultarEstados consultarEstados;
	
	@Autowired
	public EstadoController(final ConsultarEstados consultarEstados) {
		this.consultarEstados = consultarEstados;
	}
	
	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public List<Estado> consultarEstados() {
		final List<Estado> estados = consultarEstados.consultarEstados();
		return estados;
	}
}
