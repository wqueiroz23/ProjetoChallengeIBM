package br.com.studybot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.studybot.beans.Aluno;
import br.com.studybot.conexao.Conexao;

public class AlunoDAO {

	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public AlunoDAO()throws Exception {
		this.con = new Conexao().getConexao();
	}
		public String addAluno(Aluno aluno)throws Exception {
		 stmt = con.prepareStatement("INSERT INTO T_STB_ALUNO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
			stmt = con.prepareStatement("DELETE FROM T_STB_ALUNO WHERE CD_ALUNO=?");
			stmt.setInt(1, aluno.getCdAluno());
			return stmt.executeUpdate();
		}
		
		public void fechar()throws Exception{
			con.close();
		}
		
		
		public Aluno mostrarPorNome(String nome)throws Exception{
			
			Aluno aluno1=new Aluno();
			stmt=con.prepareStatement("SELECT FROM T_STB_ALUNO WHERE NM_ALUNO=?");
			stmt.setString(1, aluno1.getNome());
			rs=stmt.executeQuery();
			if(rs.next()) {
			aluno1.setHistorico(rs.getString("DS_HISTORICO"));
		    aluno1.setGrauEscolaridade(rs.getString("DS_GRAU_ESCOLARIDADE"));
			aluno1.setDataFormacao(rs.getString("DT_ANO_FORMAÇÃO"));
			aluno1.setCdAluno(rs.getInt("CD_ALUNO"));
			aluno1.setNome(rs.getString("NM_APELIDO"));
			aluno1.setApelido(rs.getString("NM_APELIDO"));
			aluno1.setRg(rs.getString("NR_RG"));
			aluno1.setCpf(rs.getString("NR_CPF"));
			aluno1.setData(rs.getString("DT_NASCIMENTO"));
			aluno1.setEmail(rs.getString("DS_EMAIL"));
			aluno1.setTelefone(rs.getInt("NR_TELEFONE"));
			aluno1.setSenha(rs.getString("NR_SENHA"));
			aluno1.setSexo(rs.getString("DS_SEXO"));
			aluno1.setIdade(rs.getInt("NR_IDADE"));
			}
			
			rs.close();
			
			
			return aluno1;
			
		}
		
		
}
