package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Aluno;
import br.com.studybot.beans.Disciplina;
import br.com.studybot.conexao.Conexao;

public class DisciplinaDAO {


	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;

	public DisciplinaDAO() throws Exception {

		this.con = new Conexao().getConexao();	

	}

	public String fechar()throws Exception{

		con.close();
		return "fechou";
	}
	
	
	public String adicionar(Disciplina disciplina1)throws Exception{
		
		stmt=con.prepareStatement("INSERT INTO T_STB_DISCIPLINA"
				+"(CD_DISCIPLINA,NM_DISCIPLINA,DS_AREA)"
				+ "VALUES(?,?,?)");
		stmt.setInt(1, disciplina1.getCodigo());
		stmt.setString(2,disciplina1.getNome());
		stmt.setString(3, disciplina1.getDescricao());
		
		stmt.executeUpdate();
		
		return "Cadastrado com sucesso";
		
	}
	public int excluirAluno(Disciplina disciplina)throws Exception {
		stmt = con.prepareStatement("DELETE FROM T_STB_DISCIPLINA WHERE CD_DISCIPLINA=?");
		stmt.setInt(1, disciplina.getCodigo());
		return stmt.executeUpdate();
	}
	

}
