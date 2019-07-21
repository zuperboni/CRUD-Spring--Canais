package com.canais.online.Canais.adapters.gateways.http;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CEPWSTest {

	@Autowired
	private CEPWS ws;
	
	@Test
	public void testaCEPWS() {
		String result = ws.findById("06703450");
		assertNotNull(result);
	}
}
