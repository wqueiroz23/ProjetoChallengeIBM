package br.com.studybot.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Curso;
import br.com.studybot.dao.CursoDAO;

public class TesteConsultarCursos {

	public static void main(String[] args) {
		
		try {
			CursoDAO dao =new CursoDAO();
			List<Curso> lista= new ArrayList<Curso>();
			String nome=JOptionPane.showInputDialog("Digite um nome");
			
			lista = new CursoDAO().mostrarCursos(nome);

		for (Curso curso : lista) {
			System.out.println(curso.getNome());
		}
		
	}catch(Exception e ) {
		e.printStackTrace();
		System.out.println(e);
	}

}
}
