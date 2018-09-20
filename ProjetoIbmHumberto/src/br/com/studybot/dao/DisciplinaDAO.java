package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Disciplina;
import br.com.studybot.conexao.Conexao;

public class DisciplinaDAO {


	private Connection Conexao;
	private PreparedStatement stmt;
	private ResultSet rs;

	public DisciplinaDAO() throws Exception {

		this.Conexao = new Conexao().getConexao();	

	}

	public String fechar()throws Exception{

		Conexao.close();
		return "fechou";
	}
	
	
	public String adicionar(Disciplina disciplina1)throws Exception{
		
		stmt=Conexao.prepareStatement("INSERT INTO T_STB_DISCIPLINA"
				+"(CD_DISCIPLINA,NM_DISCIPLINA,DS_AREA)"
				+ "VALUES(?,?,?)");
		stmt.setInt(1, disciplina1.getCodigo());
		stmt.setString(2,disciplina1.getNome());
		stmt.setString(3, disciplina1.getDescricao());
		
		stmt.executeUpdate();
		
		return "Cadastrado com sucesso";
		
		
	}

}
