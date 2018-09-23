package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Aluno;
import br.com.studybot.dao.AlunoDAO;

public class TesteAlunoGravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Aluno a = new Aluno();
		/*	a.setCdAluno(Integer.parseInt(JOptionPane.showInputDialog("digite um codigo")));
			a.setNome(JOptionPane.showInputDialog("Digite seu nome"));
			a.setApelido(JOptionPane.showInputDialog("Digite um apelido"));
			a.setCpf(JOptionPane.showInputDialog("digite seu cpf"));
			a.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
			a.setEmail(JOptionPane.showInputDialog("Digite seu email"));
			a.setGrauEscolaridade(JOptionPane.showInputDialog("Digite seu grau de escolaridade"));
			a.setRg(JOptionPane.showInputDialog("Digite seu rg"));
			a.setSexo((JOptionPane.showInputDialog("Digite seu sexo").charAt(0)));
			a.setData(JOptionPane.showInputDialog("Digite sua data de nascimento"));
			a.setDataFormacao(JOptionPane.showInputDialog("Digite sua data de formação"));
			a.setHistorico(JOptionPane.showInputDialog("Digite seu historico escolar"));
			a.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone")));
			a.setSenha(JOptionPane.showInputDialog("digite sua senha"));*/
			AlunoDAO dao= new AlunoDAO();
			System.out.println(dao.addAluno(a));
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
