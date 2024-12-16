package com.generation.farmacia.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O Atributo NOME é Obrigatório!")
	private String nome;

	@NotNull(message = "O Atributo codigo é Obrigatório!")
	@Size(max = 10, message = "O Atributo codigo deve ter no maximo 10 digitos")
	private String codigo;

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade =
	 * CascadeType.REMOVE)
	 * 
	 * @JsonIgnoreProperties("usuario") private List<Exercicio> exercicio; }
	 */
}
