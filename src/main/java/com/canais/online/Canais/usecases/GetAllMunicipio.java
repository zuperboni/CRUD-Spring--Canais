package com.canais.online.Canais.usecases;

import org.springframework.stereotype.Service;

import com.canais.online.Canais.adapters.gateways.http.MunicipioWS;

@Service
public class GetAllMunicipio {

	private MunicipioWS municipioWS;
	
	public GetAllMunicipio(MunicipioWS municipioWS) {
		this.municipioWS = municipioWS;
	}

	public String list(int idEstado) {
		return municipioWS.list(idEstado);
	}
	
}
