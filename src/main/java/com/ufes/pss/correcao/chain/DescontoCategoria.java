package com.ufes.pss.correcao.chain;

import com.ufes.pss.correcao.model.ItemPedido;
import com.ufes.pss.correcao.model.Pedido;

public class DescontoCategoria implements IMetodoDesconto {

	private String categoria = "";

	public Double calcularDesconto( Pedido pedido ) {
		Double valor = 0.0;
		for( ItemPedido itemPedido : pedido.getItens() ) {
			if( itemPedido.getProduto().getCategoria().equals( "Papelaria" ) ) {
				valor = valor + pedido.getValorTotal() * 0.5;
				categoria.concat( " (Papelaria)" );
			}
		}
		return valor;
	}

	public String getTipoDesconto() {
		return "Desconto por categoria de Produto" + categoria;
	}
}
