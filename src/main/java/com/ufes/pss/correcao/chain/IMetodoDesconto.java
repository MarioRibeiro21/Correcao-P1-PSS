package com.ufes.pss.correcao.chain;

import com.ufes.pss.correcao.model.Pedido;

public interface IMetodoDesconto {

	public Double calcularDesconto( Pedido pedido );

	public String getTipoDesconto();
}
