package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteMostrarAluno {

	public static void main(String[] args) {
	
		AlunoDAO dao=null;
		
		try {
			dao=new AlunoDAO();
			
			String nome=JOptionPane.showInputDialog("Digite um nome ");
			
			Aluno aluno1=dao.mostrarPorNome(nome);
			System.out.println(aluno1.getCdAluno());
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

	}


