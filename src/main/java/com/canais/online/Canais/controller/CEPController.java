package com.canais.online.Canais.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canais.online.Canais.usecases.GetCepById;

@RestController
@RequestMapping(path = "/CEP")
public class CEPController {
	
	Logger logger = LogManager.getLogger(CEPController.class);
	
	@Autowired
    private GetCepById cepById;
	
    @GetMapping("/{CEP}")    
    public String list(@PathVariable String CEP) {
    	logger.info("Executando a chamada da UC cepById - Param: ",CEP,CEPController.class);
		   return cepById.findById(CEP);
        }
}
