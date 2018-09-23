package br.com.studybot.teste;

import br.com.studybot.beans.ItemPedido;
import br.com.studybot.beans.Pagamento;
import br.com.studybot.beans.Pedido;

public class TesteGravarItemPedido {

	public static void main(String[] args) {
		
		
		ItemPedido item1 =new ItemPedido();
		
		item1.setCodigo(1);
		item1.setValor(350);
		item1.setNumero(1);
		item1.setQtVendida(4);
		
		Pagamento p1=new Pagamento();
		
		p1.setCodigo(9);
		p1.setDescricao("Cheque");
		
		
		
		
	}

}
