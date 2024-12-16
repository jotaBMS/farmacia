package com.generation.farmacia.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O Atributo NOME é Obrigatório!")
	private String nome;

	@NotNull(message = "O Atributo codigo é Obrigatório!")
	@Size(max = 10, message = "O Atributo codigo deve ter no maximo 10 digitos")
	private String codigo;

	private Double valor;

	@ManyToOne 
	@JsonIgnoreProperties("produto") //private List<CategoriaModel> produtos;
	private CategoriaModel categoria;
	
	/* 
	@ManyToOne //anotação para achave estrangeira na tabela tema
	@JsonIgnoreProperties("produtos") //anotação para não deixar uma resposta em loop no Json
	private CategoriasModel categorias;
	 * 
	 * */
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/*public List<CategoriaModel> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<CategoriaModel> produtos) {
		this.produtos = produtos;
	}*/
	public CategoriaModel getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	
	
	
		 }
	 

