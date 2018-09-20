package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Curso;
import br.com.studybot.dao.CursoDAO;

public class TesteGravarCurso {

	public static void main(String[] args) {
		
		try {
			Curso curso1=new Curso();
			curso1.setCodigo(1);
			curso1.setNome("Java");
			curso1.setDescricao("Java Web");
			curso1.setValor(500);
			//curso1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
			//curso1.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
			//curso1.setDescricao(JOptionPane.showInputDialog("Digite a descrição"));
			//curso1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do curso")));
			CursoDAO dao=new CursoDAO();
			
			System.out.println(dao.adicionar(curso1));
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println(e);
			
		}
	}

}
