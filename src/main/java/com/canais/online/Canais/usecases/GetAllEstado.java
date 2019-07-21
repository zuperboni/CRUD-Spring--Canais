package com.canais.online.Canais.usecases;

import org.springframework.stereotype.Service;

import com.canais.online.Canais.adapters.gateways.http.EstadoWS;

@Service
public class GetAllEstado {

	private EstadoWS estadoWS;

	public GetAllEstado(EstadoWS estadoWS) {
		super();
		this.estadoWS = estadoWS;
	}
	
	public String list() {
		return estadoWS.list();
	}
}
