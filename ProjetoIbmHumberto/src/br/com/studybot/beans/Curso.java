package br.com.studybot.beans;



public class Curso {

	private int codigo;
	private String nome;
	private String descricao;
	private double valor;
	
	
	
	
	public Curso() {
		super();
	}

	public Curso(int codigo, String nome, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
	
	
	
	
	
		
}
