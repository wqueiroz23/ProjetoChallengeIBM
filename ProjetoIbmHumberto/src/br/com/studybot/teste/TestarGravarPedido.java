package br.com.studybot.teste;

import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Pagamento;
import br.com.studybot.beans.Pedido;
import br.com.studybot.dao.PedidoDAO;

public class TestarGravarPedido {

	public static void main(String[] args) {
		
		try {
			Pedido p= new Pedido();
			p.setCodigo(100);
			p.setData("12/08/2018");
			p.setValor(300);
			
			Pagamento pag1=new Pagamento();
			pag1.setCodigo(1);
			pag1.setDescricao("Debito");
			
			Aluno aluno1=new Aluno(1, "Nome", "ap","12121212", "1212", "email@email",123213, "123", 'M', 12, "12/07/1999", "sdasd", "wqdqe", "qweqwe");
						
			
			p.setAluno(aluno1);
			p.setPagamento(pag1);
			
            PedidoDAO dao=new PedidoDAO();
            
            
            
			
			System.out.println(dao.adicionar(p));
			
			
		
		
	}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println(e);
		
	}

}
}