package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteAlunoExcluir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Aluno a = new Aluno();
			a.setCdAluno(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do aluno para ser excluido")));
			AlunoDAO dao = new AlunoDAO();
			System.out.println(dao.excluirAluno(a));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
