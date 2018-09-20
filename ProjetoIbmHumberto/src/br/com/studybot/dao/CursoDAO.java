package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Aula;
import br.com.studybot.beans.Curso;
import br.com.studybot.conexao.Conexao;

public class CursoDAO {
	
	private Connection conexao;
	private PreparedStatement stmt;
	private ResultSet rs;

	public CursoDAO()throws Exception{
		conexao=new Conexao().getConexao();
	}
	public String fechar()throws Exception{
		
		conexao.close();
		return "fechou";
	}
	
	public String adicionar(Curso curso1) throws Exception{
		stmt=conexao.prepareStatement("INSERT INTO T_STB_CURSO"
				+"(CD_CURSO,NM_CURSO,DS_CURSO,VL_CURSO)"
				+ "VALUES(?,?,?,?)");
		stmt.setInt   (1, curso1.getCodigo());
		stmt.setString(2, curso1.getNome());;
		stmt.setString(3, curso1.getDescricao());
		stmt.setDouble(4, curso1.getValor());
		stmt.executeUpdate();
		return"Cadastrado com sucesso";
		}
	
	

}
