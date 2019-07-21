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
public class GetAllCliente {

	@Autowired
	private ClienteRepository repository;

	public GetAllCliente(ClienteRepository repository) {
		this.repository = repository;
	}
	
    public Iterable<Cliente> list() {
        return repository.findAll();
    }
}
