/**
 * 
 */
package com.canais.online.Canais.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canais.online.Canais.adapters.gateways.repositories.ClienteRepository;
import com.canais.online.Canais.entities.Cliente;

/**
 * @author monica.dos.santos
 *
 */
@Service
public class GetClienteById {
	@Autowired
	private ClienteRepository repository;

	public GetClienteById(ClienteRepository repository) {
		this.repository = repository;
	}
	
    public Cliente findOne(Long CPF) {
        return repository.findOne(CPF);
    }
}
