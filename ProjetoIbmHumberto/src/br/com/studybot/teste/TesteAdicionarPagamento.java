package br.com.studybot.teste;

import br.com.studybot.beans.Pagamento;
import br.com.studybot.dao.PagamentoDAO;

public class TesteAdicionarPagamento {

	public static void main(String[] args) {
	
		
		try {
			Pagamento pag1=new Pagamento();
			
			pag1.setCodigo(26);
			pag1.setDescricao("Cheque");
			
			PagamentoDAO dao =new PagamentoDAO();
			System.out.println(dao.adicionar(pag1));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
