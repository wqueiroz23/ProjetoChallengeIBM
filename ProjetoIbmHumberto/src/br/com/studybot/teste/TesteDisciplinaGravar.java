package br.com.studybot.teste;

import br.com.studybot.beans.Disciplina;
import br.com.studybot.dao.CursoDAO;
import br.com.studybot.dao.DisciplinaDAO;

public class TesteDisciplinaGravar {

	public static void main(String[] args) {
		
		try {
			
			Disciplina disciplina1 = new Disciplina();
			
			disciplina1.setCodigo(1);
			disciplina1.setNome("Orientação objeto");
			disciplina1.setDescricao("Android");
			
			DisciplinaDAO dao = new DisciplinaDAO();
			System.out.println(dao.adicionar(disciplina1));
			

			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println(e);
			
		}

	}

}
