package com.ufes.pss.correcao.chain;

import com.ufes.pss.correcao.model.Pedido;

public class impostoISS implements IMetodoImposto {

	public Double calcularImposto( Pedido pedido ) {
		return pedido.getValorTotal() * 0.02;
	}

	public String getTipoImposto() {
		return "Imposto ISS";
	}

}
