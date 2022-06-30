import java.time.LocalDate;
import java.util.ArrayList;

import com.ufes.pss.correcao.model.ItemPedido;
import com.ufes.pss.correcao.model.Pedido;
import com.ufes.pss.correcao.model.Produto;
import com.ufes.pss.correcao.service.ImpostoService;
import com.ufes.pss.correcao.service.PedidoDescontoService;

public class Main {

	public static void main( String[] args ) {
		Produto lapis = new Produto( "Lápis", 2.50, 12, "Papelaria" );
		Produto caneta = new Produto( "Caneta", 2.50, 4, "Papelaria" );
		Produto bolaGude = new Produto( "Bola de Gude", 2.50, 6, "Lazer" );
		Produto pastaDente = new Produto( "Pasta de Dente", 2.50, 3, "Higiene" );

		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add( lapis );
		produtos.add( caneta );
		produtos.add( bolaGude );
		produtos.add( pastaDente );

		ItemPedido lapisPedido = new ItemPedido( 4, lapis );
		ItemPedido bolaGudePedido = new ItemPedido( 3, bolaGude );

		Pedido pedidoFeito = new Pedido( "Mario", LocalDate.now() );

		pedidoFeito.adicionaItem( lapisPedido );
		pedidoFeito.adicionaItem( bolaGudePedido );

		PedidoDescontoService descontoService = new PedidoDescontoService();
		ImpostoService impostoService = new ImpostoService();

		descontoService.processarDesconto( pedidoFeito );
		impostoService.processarImposto( pedidoFeito );

		System.out.println( pedidoFeito );
	}
}
