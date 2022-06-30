package com.ufes.pss.correcao.service;

import java.util.ArrayList;

import com.ufes.pss.correcao.chain.DescontoCategoria;
import com.ufes.pss.correcao.chain.DescontoItem;
import com.ufes.pss.correcao.chain.DescontoNatal;
import com.ufes.pss.correcao.chain.IMetodoDesconto;
import com.ufes.pss.correcao.model.Desconto;
import com.ufes.pss.correcao.model.Pedido;

public class PedidoDescontoService {

	private ArrayList<IMetodoDesconto> metodosDesconto;

	public PedidoDescontoService() {
		this.metodosDesconto = new ArrayList<IMetodoDesconto>();
		this.metodosDesconto.add( new DescontoCategoria() );
		this.metodosDesconto.add( new DescontoNatal() );
		this.metodosDesconto.add( new DescontoItem() );
	}

	public void processarDesconto( Pedido pedido ) {
		for( IMetodoDesconto metodoDesconto : metodosDesconto ) {
			Double valor = metodoDesconto.calcularDesconto( pedido );
			if( valor != 0 ) {
				pedido.adicionaDesconto( new Desconto( metodoDesconto.getTipoDesconto(), valor ) );
			}
		}
	}

}
