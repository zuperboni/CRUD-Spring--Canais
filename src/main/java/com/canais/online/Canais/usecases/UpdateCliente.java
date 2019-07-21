package com.canais.online.Canais.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canais.online.Canais.adapters.gateways.repositories.ClienteRepository;
import com.canais.online.Canais.entities.Cliente;

@Service
public class UpdateCliente {
	@Autowired
	private ClienteRepository repository;

	public UpdateCliente(ClienteRepository repository) {
		this.repository = repository;
	}
	
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }
}
