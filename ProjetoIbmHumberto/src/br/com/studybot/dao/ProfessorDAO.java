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
		stmt.setString(1,pro.getComprovantePagamento());
		stmt.setInt(2, pro.getCdProfessor());
		stmt.setString(3, pro.getNome());
		stmt.setString(4, pro.getApelido());
		stmt.setString(5, pro.getRg());
		stmt.setInt(6, pro.getCpf());
		stmt.setString(7, pro.getDataNascimento());
		stmt.setString(8, pro.getEmail());
		stmt.setInt(9,pro.getTelefone());
		stmt.setString(10, pro.getSenha());
		stmt.setLong(11, pro.getSexo());
		stmt.setInt(12, pro.getIdade());
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
