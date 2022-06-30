package com.ufes.pss.correcao.model;

public class ItemPedido {

	private int qtdPedido;
	private Double valorUnitario;
	private Double valorTotal;
	private Produto produto;

	public ItemPedido( int i, Produto produto ) {
		this.qtdPedido = i;
		this.produto = produto;
		this.valorUnitario = produto.getPrecoUnitario();
		this.valorTotal = this.valorUnitario * i;
	}

	public int getQtdPedido() {
		return qtdPedido;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public Produto getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "ItemPedido{" + "qtdPedido=" + qtdPedido + ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + ", produto=" + produto.toString() + '}';
	}

}
