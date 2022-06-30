package com.ufes.pss.correcao.model;

public class Desconto {

	String tipo;
	Double valor;

	public Desconto( String tipo, Double valor ) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo( String tipo ) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor( Double valor ) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Desconto{" + "tipo='" + tipo + '\'' + ", valor=" + valor + '}';
	}

}
