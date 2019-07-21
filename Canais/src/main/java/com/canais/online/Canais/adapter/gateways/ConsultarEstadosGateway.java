/**
 * 
 */
package com.canais.online.Canais.adapter.gateways;

import java.util.List;

import org.springframework.stereotype.Component;

import com.canais.online.Canais.domain.Estado;

/**
 * @author monica.dos.santos
 *
 */
@Component
public interface ConsultarEstadosGateway {

	List<Estado> consultarEstados();

}
