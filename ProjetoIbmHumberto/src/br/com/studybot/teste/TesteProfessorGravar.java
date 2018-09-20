package br.com.studybot.teste;

import javax.swing.JOptionPane;

import br.com.studybot.beans.Professor;

public class TesteProfessorGravar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Professor pro = new Professor();
			pro.setCdProfessor(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo")));
			pro.setNome(JOptionPane.showInputDialog("Digite seu nome"));
			pro.setApelido(JOptionPane.showInputDialog("Digite um apelido"));
			pro.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf, apenas numero")));
			pro.setRg(JOptionPane.showInputDialog("Digite seu rg "));
			pro.setEmail(JOptionPane.showInputDialog("Digite seu email"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
