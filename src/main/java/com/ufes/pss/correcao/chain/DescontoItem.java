package com.ufes.pss.correcao.chain;

import com.ufes.pss.correcao.model.ItemPedido;
import com.ufes.pss.correcao.model.Pedido;

public class DescontoItem implements IMetodoDesconto {

	public Double calcularDesconto( Pedido pedido ) {
		for( ItemPedido itemPedido : pedido.getItens() ) {
			if( itemPedido.getProduto().getNome().equalsIgnoreCase( "Lápis" ) ) {
				return pedido.getValorTotal() * 0.05;
			}
		}
		return 0.0;
	}

	public String getTipoDesconto() {
		return "Desconto Lápis";
	}
}
