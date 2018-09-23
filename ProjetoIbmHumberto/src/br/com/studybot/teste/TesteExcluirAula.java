package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aula;
import br.com.studybot.dao.AulaDAO;

public class TesteExcluirAula {

	public static void main(String[] args) {
		
		try {
			Aula a1=new Aula();
			a1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da aula a ser excluida")));
		AulaDAO dao = new AulaDAO();
		System.out.println(dao.excluirAula(a1));
		
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}

}
