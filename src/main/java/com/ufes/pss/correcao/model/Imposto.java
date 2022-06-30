package com.ufes.pss.correcao.model;

import java.text.DecimalFormat;

public class Imposto {

	private String tipo;
	private Double valor;

	public Imposto( String tipo, Double valor ) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor( Double valor ) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Imposto{" + "tipo='" + tipo + '\'' + ", valor=" + new DecimalFormat( "0.00" ).format( valor ) + '}';
	}
}
