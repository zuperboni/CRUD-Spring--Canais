package com.canais.online.Canais.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_endereco;
	private String CEP;
	private int id_estado;
	private String nome_estado;
	private int id_municipio;
	private String nome_municipio;
	private int num_endereco;
	private String complemento_endereco;
	
	public Endereco(){}

	public Endereco(int id_endereco, String cEP, int id_estado, String nome_estado, int id_municipio,
			String nome_municipio, int num_endereco, String complemento_endereco, Cliente cliente) {
		super();
		this.id_endereco = id_endereco;
		CEP = cEP;
		this.id_estado = id_estado;
		this.nome_estado = nome_estado;
		this.id_municipio = id_municipio;
		this.nome_municipio = nome_municipio;
		this.num_endereco = num_endereco;
		this.complemento_endereco = complemento_endereco;
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public String getNome_estado() {
		return nome_estado;
	}

	public void setNome_estado(String nome_estado) {
		this.nome_estado = nome_estado;
	}

	public int getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getNome_municipio() {
		return nome_municipio;
	}

	public void setNome_municipio(String nome_municipio) {
		this.nome_municipio = nome_municipio;
	}

	public int getNum_endereco() {
		return num_endereco;
	}

	public void setNum_endereco(int num_endereco) {
		this.num_endereco = num_endereco;
	}

	public String getComplemento_endereco() {
		return complemento_endereco;
	}

	public void setComplemento_endereco(String complemento_endereco) {
		this.complemento_endereco = complemento_endereco;
	}
	}
