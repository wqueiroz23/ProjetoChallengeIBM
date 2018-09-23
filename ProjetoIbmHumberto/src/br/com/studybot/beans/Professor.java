package br.com.studybot.beans;

public class Professor {

	private int cdProfessor;
	private String nome;
	private String apelido;
	private String rg;
	private String cpf;
	private String email;
	private int telefone;
	private String senha;
	private String sexo;
	private int idade;
	private String comprovantePagamento;
	private String dataNascimento;
	
	
	
	public Professor(int cdProfessor, String nome, String apelido, String rg, String cpf, String email, int telefone,
			String senha, String sexo, int idade, String comprovantePagamento, String dataNascimento) {
		super();
		this.cdProfessor = cdProfessor;
		this.nome = nome;
		this.apelido = apelido;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.sexo = sexo;
		this.idade = idade;
		this.comprovantePagamento = comprovantePagamento;
		this.dataNascimento = dataNascimento;
	}
	public Professor() {
		super();
	}
	
	
	
	
	public int getCdProfessor() {
		return cdProfessor;
	}
	public void setCdProfessor(int cdProfessor) {
		this.cdProfessor = cdProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getComprovantePagamento() {
		return comprovantePagamento;
	}
	public void setComprovantePagamento(String comprovantePagamento) {
		this.comprovantePagamento = comprovantePagamento;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
		
}
