package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Disciplina;
import br.com.studybot.dao.CursoDAO;
import br.com.studybot.dao.DisciplinaDAO;

public class TesteDisciplinaGravar {

	public static void main(String[] args) {
		
		try {
			
			Disciplina disciplina1 = new Disciplina();
			
			disciplina1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
			disciplina1.setNome(JOptionPane.showInputDialog("Digite o nome da Disciplina"));
			disciplina1.setDescricao(JOptionPane.showInputDialog("Digite a descrição da disciplina"));
			
			DisciplinaDAO dao = new DisciplinaDAO();
			System.out.println(dao.adicionar(disciplina1));
			

			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println(e);
			
		}

	}

}
