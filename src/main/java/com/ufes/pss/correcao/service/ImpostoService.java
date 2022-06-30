package com.ufes.pss.correcao.service;

import java.util.ArrayList;

import com.ufes.pss.correcao.chain.IMetodoImposto;
import com.ufes.pss.correcao.chain.ImpostoICMS;
import com.ufes.pss.correcao.chain.impostoISS;
import com.ufes.pss.correcao.model.Imposto;
import com.ufes.pss.correcao.model.Pedido;

public class ImpostoService {

	private ArrayList<IMetodoImposto> metodosImposto;

	public ImpostoService() {
		this.metodosImposto = new ArrayList<IMetodoImposto>();
		this.metodosImposto.add( new impostoISS() );
		this.metodosImposto.add( new ImpostoICMS() );
	}

	public void processarImposto( Pedido pedido ) {
		for( IMetodoImposto metodoImposto : metodosImposto ) {
			double valor = metodoImposto.calcularImposto( pedido );
			if( valor != 0 ) {
				pedido.adicionaImposto( new Imposto( metodoImposto.getTipoImposto(), valor ) );
			}
		}
	}
}
