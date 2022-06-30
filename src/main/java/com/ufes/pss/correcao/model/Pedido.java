package com.ufes.pss.correcao.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

	private String nome;
	private LocalDate data;
	private Double valorTotal;
	private Double valorDescontosImpostos;
	private ArrayList<ItemPedido> itens;
	private ArrayList<Imposto> impostosAplicados;
	private ArrayList<Desconto> descontosConcedidos;

	public Pedido( String nome, LocalDate data ) {
		this.nome = nome;
		this.data = data;
		this.valorTotal = 0.0;
		this.valorDescontosImpostos = 0.0;
		this.impostosAplicados = new ArrayList<Imposto>();
		this.descontosConcedidos = new ArrayList<Desconto>();
		this.itens = new ArrayList<ItemPedido>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public Double getValorFinalComDescontos() {
		return this.valorDescontosImpostos;
	}

	public ArrayList<Imposto> getImpostosAplicados() {
		return impostosAplicados;
	}

	public ArrayList<Desconto> getDescontosConcedidos() {
		return descontosConcedidos;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void adicionaDesconto( Desconto desconto ) {
		this.descontosConcedidos.add( desconto );
		this.valorDescontosImpostos = this.valorDescontosImpostos - desconto.getValor();
	}

	public void adicionaImposto( Imposto imposto ) {
		this.impostosAplicados.add( imposto );
		this.valorDescontosImpostos = this.valorDescontosImpostos + imposto.getValor();
	}

	public void adicionaItem( ItemPedido itemPedido ) {
		itens.add( itemPedido );
		this.valorTotal = this.valorTotal + itemPedido.getValorTotal();
	}

	@Override
	public String toString() {
		return "Pedido: \n" + "cliente = " + nome + "\ndata = " + data + "\nitens = " + itens.toString() + "\nvalorTotal = " + valorTotal + "\nimpostosAplicados = " + impostosAplicados.toString() + "\ndescontosConcedidos = " + descontosConcedidos.toString() + "\nvalorFinalComDescontos = "
				+ ( valorTotal - valorDescontosImpostos )

		;
	}
}
