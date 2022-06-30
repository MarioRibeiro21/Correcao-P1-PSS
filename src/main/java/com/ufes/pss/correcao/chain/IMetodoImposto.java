package com.ufes.pss.correcao.chain;

import com.ufes.pss.correcao.model.Pedido;

public interface IMetodoImposto {

	public Double calcularImposto( Pedido pedido );

	public String getTipoImposto();
}
