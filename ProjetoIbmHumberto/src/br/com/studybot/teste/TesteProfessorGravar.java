package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Professor;
import br.com.studybot.dao.ProfessorDAO;

public class TesteProfessorGravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Professor pro = new Professor();
			pro.setCdProfessor(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
			pro.setNome(JOptionPane.showInputDialog("Digite seu nome"));
			pro.setApelido(JOptionPane.showInputDialog("Digite um apelido"));
			pro.setRg(JOptionPane.showInputDialog("Digite seu rg "));
			pro.setCpf(JOptionPane.showInputDialog("Digite seu cpf, apenas numero"));
			pro.setDataNascimento(JOptionPane.showInputDialog("digite sua data de nascimento"));
			pro.setEmail(JOptionPane.showInputDialog("Digite seu email"));
			pro.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone")));
			pro.setSenha(JOptionPane.showInputDialog("Digite a sua senha"));
			pro.setSexo(JOptionPane.showInputDialog("Digite o sexo"));
			pro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
			
			
		
			
			ProfessorDAO dao = new ProfessorDAO();
			System.out.println(dao.addProfessor(pro));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
