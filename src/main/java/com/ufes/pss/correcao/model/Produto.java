package com.ufes.pss.correcao.model;

public class Produto {

	String nome;
	Double precoUnitario;
	int qtdEstoque;
	String categoria;

	public Produto( String nome, double precoUnitario, int qtdEstoque, String categoria ) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.qtdEstoque = qtdEstoque;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario( Double precoUnitario ) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque( int qtdEstoque ) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria( String categoria ) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Produto{" + "nome='" + nome + '\'' + ", precoUnitario=" + precoUnitario + ", categoria='" + categoria + '\'' + '}';
	}

}
