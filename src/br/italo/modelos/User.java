package br.italo.modelos;

public class User {
	
	private int id;
	private String nome;
	private String sobrenome;
	private int CPF;
	private int RG;
	private String dataNasc;
	private String genero;
	private int numTel;
	private String email;
	private String endereco;
	private int senha;
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getSenha() {
		return senha;
	}


	public User(int id, String nome, String sobrenome, int CPF, String dataNasc, int numTel, String email, String endereco, int senha) {

		super();

		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
		this.dataNasc = dataNasc;
		this.numTel = numTel;
		this.email = email;
		this.endereco = endereco;
		this.senha = senha;
	}
}
