package com.canais.online.Canais.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canais.online.Canais.usecases.GetAllMunicipio;

@RestController
@RequestMapping(path = "/municipio")
public class MunicipioController {
	
	Logger logger = LogManager.getLogger(MunicipioController.class);
	
	@Autowired
    private GetAllMunicipio getAllMunicipio;
	
	@GetMapping("/{id}")    
    public String list(@PathVariable int id) {
		logger.info("Executando a chamada da UC getAllMunicipio - Param: ",id ,MunicipioController.class);
		   return getAllMunicipio.list(id);
        }
}
