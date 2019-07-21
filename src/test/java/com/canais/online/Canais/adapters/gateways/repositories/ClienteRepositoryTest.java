package com.canais.online.Canais.adapters.gateways.repositories;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.canais.online.Canais.entities.Cliente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteRepositoryTest {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Test
	public void testaGetClientePadrao() {
		Cliente cli = clienteRepository.findOne(12345678909L);
		assertNotNull(cli);
	}
	
}
