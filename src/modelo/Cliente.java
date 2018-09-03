package modelo;

import persistencia.DMCliente;

public class Cliente {
	private String nome;
	private int id_endereco;
	private int idade;
	private String aniversario;
	private String email;
	private String profissao;
	private int status_bloq;
	private DMCliente dmc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getStatus_bloq() {
		return status_bloq;
	}
	public void setStatus_bloq(int status_bloq) {
		this.status_bloq = status_bloq;
	}
	
	public Cliente(String nome, int id_endereco, int idade, String aniversario, String email, String profissao, int status_bloq) {
		this.nome = nome;
		this.id_endereco = id_endereco;
		this.idade = idade;
		this.aniversario = aniversario;
		this.email = email;
		this.profissao = profissao;
		this.status_bloq = status_bloq;
		dmc = new DMCliente();
		dmc.conectar("biblioteca", "root", "root");
		System.out.println("Conectado ao banco de dados.");
	}	
}