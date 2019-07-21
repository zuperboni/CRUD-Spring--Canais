package com.canais.online.Canais.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.canais.online.Canais.adapter.gateways.ConsultarEstadosGateway;
import com.canais.online.Canais.usecases.ConsultarEstados;

@Configuration
public class adapterConfig {

	@Autowired
    private ConsultarEstadosGateway consultarEstadosGateway;
	
	
    @Bean
    public ConsultarEstados consultarEstados() {
        return new ConsultarEstados(consultarEstadosGateway);
    }
}
