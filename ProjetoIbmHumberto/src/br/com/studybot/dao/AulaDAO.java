package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Aula;
import br.com.studybot.conexao.Conexao;

public class AulaDAO {

	private Connection conexao;
	private PreparedStatement stmt;
	private ResultSet rs;

	public AulaDAO() throws Exception {
		conexao = new Conexao().getConexao();

	}

	public String fechar() throws Exception {

		conexao.close();
		return "fechou";
	}

	public String adicionar(Aula a1)throws Exception {
		
		stmt=conexao.prepareStatement("INSERT INTO T_STB_AULA(CD_AULA,NM_AULA,DS_DURACAO,CD_DISCIPLINA,CD_CURSO,CD_PROFESSOR"
				                   + "VALUES (?,?,?,?,?,?)");
		stmt.setInt(1,a1.getCodigo());
		stmt.setString(2,a1.getNome());
		stmt.setString(3, a1.getDescricao());
		stmt.setInt(4, a1.getDisciplina().getCodigo());
		stmt.setInt(5, a1.getCurso().getCodigo());
		stmt.setInt(6, a1.getProfessor().getCdProfessor());
		
		stmt.executeUpdate();
		
		
		return"Cadastrado com sucesso";	
	}
	
	
}
