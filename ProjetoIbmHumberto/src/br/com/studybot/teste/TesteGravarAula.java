package br.com.studybot.teste;

import br.com.studybot.beans.Aula;
import br.com.studybot.beans.Curso;
import br.com.studybot.beans.Disciplina;
import br.com.studybot.beans.Professor;
import br.com.studybot.dao.AulaDAO;

public class TesteGravarAula {

	public static void main(String[] args) {
		
		try {
			Aula a1=new Aula();
			
			a1.setCodigo(1);
			a1.setNome("Herança e Interface");
			
			Disciplina d1= new Disciplina();
			d1.setCodigo(1);
			d1.setNome("Java");
			d1.setDescricao("Orientação a Objetos ");
			
			Curso c1=new Curso();
			c1.setCodigo(2);
			c1.setNome("Analise e Desenvolvimento de Sistemas");
			c1.setDescricao("Curso tecnologo");
			c1.setValor(600);
			
			Professor p1=new Professor();
			p1.setCdProfessor(12);
			p1.setNome("Sergio Marchina");
			p1.setApelido("Professor");
			p1.setRg("472319777");
			p1.setCpf("39240888877");
			p1.setDataNascimento("12/12/1990");
			p1.setEmail("wqueiroz23@hotmail.com");
			p1.setTelefone(997350520);
			p1.setSenha("minhasenha1");
			p1.setSexo("M");
			p1.setIdade(27);
			
			AulaDAO dao = new AulaDAO();
			System.out.println(dao.adicionar(a1));
			
		
			
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}

	}

}
