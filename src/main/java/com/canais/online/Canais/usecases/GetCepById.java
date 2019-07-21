package com.canais.online.Canais.usecases;

import org.springframework.stereotype.Service;

import com.canais.online.Canais.adapters.gateways.http.CEPWS;

@Service
public class GetCepById {

	private CEPWS cepWS;

	public GetCepById(CEPWS cepWS) {
		this.cepWS = cepWS;
	}
	
	public String findById(String CEP) {
		return cepWS.findById(CEP);
	}
}
