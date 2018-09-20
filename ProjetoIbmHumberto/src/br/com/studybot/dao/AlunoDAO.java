package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.studybot.beans.Aluno;
import br.com.studybot.conexao.Conexao;

public class AlunoDAO {

	private Connection minhaConexao;
	
	public AlunoDAO()throws Exception {
		this.minhaConexao = new Conexao().getConexao();
	}
		public String addAluno(Aluno aluno)throws Exception {
		PreparedStatement stmt = minhaConexao.prepareStatement("INSERT INTO T_STB_ALUNO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, aluno.getHistorico());
		stmt.setString(2, aluno.getGrauEscolaridade());
		stmt.setString(3, aluno.getDataFormacao());
		stmt.setInt(4, aluno.getCdAluno());
		stmt.setString(5, aluno.getNome());
		stmt.setString(6, aluno.getApelido());
		stmt.setString(7, aluno.getRg());
		stmt.setString(8, aluno.getCpf());
		stmt.setString(9,aluno.getData());
		stmt.setString(10, aluno.getEmail());
		stmt.setInt(11,aluno.getTelefone());
		stmt.setString(12, aluno.getSenha());
		stmt.setString(13,String.valueOf(aluno.getSexo()));
		stmt.setInt(14, aluno.getIdade());

		stmt.executeUpdate();
		return "Adicionado"; 
		}	
		
		
		public int excluirAluno(Aluno aluno)throws Exception {
			PreparedStatement stmt = minhaConexao.prepareStatement("DELETE FROM T_STB_ALUNO WHERE CD_ALUNO=?");
			stmt.setInt(1, aluno.getCdAluno());
			return stmt.executeUpdate();
		}
		
		public void fechar()throws Exception{
			minhaConexao.close();
		}
		
		
}
