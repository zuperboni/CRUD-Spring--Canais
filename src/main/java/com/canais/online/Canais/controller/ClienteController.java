/**
 * 
 */
package com.canais.online.Canais.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canais.online.Canais.entities.Cliente;
import com.canais.online.Canais.usecases.GetAllCliente;
import com.canais.online.Canais.usecases.GetClienteById;
import com.canais.online.Canais.usecases.SaveCliente;
import com.canais.online.Canais.usecases.UpdateCliente;

/**
 * @author monica.dos.santos
 *
 */
@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {
	
	Logger logger = LogManager.getLogger(ClienteController.class);
	
    @Autowired
    private GetAllCliente getAllCliente;

    @Autowired
    private GetClienteById getClienteById;
    
    @Autowired
    private SaveCliente saveCliente;
    
    @Autowired
    private UpdateCliente updateCliente;
        

	public ClienteController(GetAllCliente getAllCliente, GetClienteById getClienteById, SaveCliente saveCliente,
			UpdateCliente updateCliente) {
		this.getAllCliente = getAllCliente;
		this.getClienteById = getClienteById;
		this.saveCliente = saveCliente;
		this.updateCliente = updateCliente;
	}

	@GetMapping
    public Iterable<Cliente> list() {
		logger.info("Executando a chamada da UC getAllCliente",ClienteController.class);
        return getAllCliente.list();
    }
    
    @GetMapping("{CPF}")
    public Cliente findById(@PathVariable Long CPF) {
    	logger.info("Executando a chamada da UC getClienteById - Param: ",CPF,ClienteController.class);
    	return getClienteById.findOne(CPF);
    }
    
    @PostMapping
    public Cliente insert(@RequestBody Cliente cliente) {
    	logger.info("Executando a chamada da UC saveCliente - Param: ",cliente,ClienteController.class);
    	return saveCliente.save(cliente);
    }
    
    @PutMapping
    public Cliente update(@RequestBody Cliente cliente) {
    	logger.info("Executando a chamada da UC updateCliente - Param: ",cliente,ClienteController.class);
    	return updateCliente.save(cliente);
    }
    
}
