package com.canais.online.Canais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import com.canais.online.Canais.usecases.GetAllEstado;

@RestController
@RequestMapping(path = "/estado")
public class EstadoController {
	
	Logger logger = LogManager.getLogger(EstadoController.class);
	
	
	@Autowired
    private GetAllEstado getAllEstado;
	
    @GetMapping    
    public String list() {
    	logger.info("Executando a chamada da UC GetAllEstado",EstadoController.class);
		   return getAllEstado.list();
        }
    }

