package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.studybot.beans.Professor;
import br.com.studybot.conexao.Conexao;

public class ProfessorDAO {

	private Connection minhaConexao;
	
	
	public ProfessorDAO()throws Exception {
		this.minhaConexao= new Conexao().getConexao();
	}
	
	public String addProfessor(Professor pro)throws Exception {
		PreparedStatement stmt= minhaConexao.prepareStatement("INSERT INTO T_STB_PROFESSOR VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		
		stmt.setInt(1, pro.getCdProfessor());
		stmt.setString(2, pro.getNome());
		stmt.setString(3, pro.getApelido());
		stmt.setString(4, pro.getRg());
		stmt.setString(5, pro.getCpf());
		stmt.setString(6, pro.getDataNascimento());
		stmt.setString(7, pro.getEmail());
		stmt.setInt(8,pro.getTelefone());
		stmt.setString(9, pro.getSenha());
		stmt.setString(10, pro.getSexo());
		stmt.setInt(11, pro.getIdade());
		stmt.executeUpdate();
		
		return "Adicionado";
	}
	
	
	public int excluirProfessor(Professor pro)throws Exception {
		
		PreparedStatement stmt= minhaConexao.prepareStatement("DELETE FROM T_STB_PROFESSOR WHERE CD_PROFESSOR=?");
		stmt.setInt(1, pro.getCdProfessor());
		return stmt.executeUpdate();
	}
	
	public void fechar()throws Exception{
		minhaConexao.close();
	}
	
}
