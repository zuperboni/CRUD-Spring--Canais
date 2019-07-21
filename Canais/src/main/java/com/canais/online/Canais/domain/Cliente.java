/**
 * 
 */
package com.canais.online.Canais.domain;

/**
 * @author monica.dos.santos
 *
 */

public class Cliente {

	private String cpf;
	private String nome;
	private Endereco enderco;	
	
	/**
	 * 
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the enderco
	 */
	public Endereco getEnderco() {
		return enderco;
	}

	/**
	 * @param enderco the enderco to set
	 */
	public void setEnderco(Endereco enderco) {
		this.enderco = enderco;
	}

}
