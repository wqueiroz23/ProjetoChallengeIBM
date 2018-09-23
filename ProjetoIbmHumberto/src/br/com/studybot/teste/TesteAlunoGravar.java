package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteAlunoGravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Aluno a = new Aluno();
			a.setHistorico("xxxxx");
			a.setGrauEscolaridade("superior");
			a.setDataFormacao("12/12/2019");
			a.setCdAluno(55);
			a.setNome("Jonny");
			a.setApelido("Jow");
			a.setRg("xxxxxxx");
			a.setCpf("39240888888");
			a.setData("12/12/1990");
			a.setEmail("w7queiroz@gmail.com");
			a.setTelefone(11);
			a.setSenha("will1566");
			a.setSexo("M");
			a.setIdade(28);

			AlunoDAO dao = new AlunoDAO();
			System.out.println(dao.addAluno(a));

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
			System.out.println(e);
		}
	}

}
