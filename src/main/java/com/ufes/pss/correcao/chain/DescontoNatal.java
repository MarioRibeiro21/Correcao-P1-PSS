package com.ufes.pss.correcao.chain;

import java.time.LocalDate;

import com.ufes.pss.correcao.model.Pedido;

public class DescontoNatal implements IMetodoDesconto {

	public Double calcularDesconto( Pedido pedido ) {
		if( !pedido.getData().isBefore( LocalDate.parse( "2022-12-01" ) ) && !pedido.getData().isAfter( LocalDate.parse( "2022-12-25" ) ) ) {
			return pedido.getValorTotal() * 0.1;
		}
		return 0.0;
	}

	public String getTipoDesconto() {
		return "Desconto especial de Natal";
	}
}
