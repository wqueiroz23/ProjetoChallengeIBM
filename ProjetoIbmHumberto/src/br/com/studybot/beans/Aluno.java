package br.com.studybot.beans;

public class Aluno {

	private int cdAluno;
	private String nome;
	private String apelido;
	private String rg;
	private String cpf;
	private String email;
	private int telefone;
	private String senha;
	private char sexo;
	private int idade;
	private String data;
	private String historico;
	private String grauEscolaridade;
	private String dataFormacao;
	
	
	
	
	
	public Aluno(int cdAluno, String nome, String apelido, String rg, String cpf, String email, int telefone,
			String senha, char sexo, int idade, String data, String historico, String grauEscolaridade,
			String dataFormacao) {
		super();
		this.cdAluno = cdAluno;
		this.nome = nome;
		this.apelido = apelido;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.sexo = sexo;
		this.idade = idade;
		this.data = data;
		this.historico = historico;
		this.grauEscolaridade = grauEscolaridade;
		this.dataFormacao = dataFormacao;
	}
	public Aluno() {
		super();
	}
	public int getCdAluno() {
		return cdAluno;
	}
	public void setCdAluno(int cdAluno) {
		this.cdAluno = cdAluno;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}
	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}
	public String getDataFormacao() {
		return dataFormacao;
	}
	public void setDataFormacao(String dataFormacao) {
		this.dataFormacao = dataFormacao;
	}
	
	
		
	
	}
