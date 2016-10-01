package model;

import java.util.Date;

public class Funcionario {
	
	private int id;
	private String nome;
	private byte resddd;
	private int restel;
	private byte celddd;
	private int celtel;
	private int rg;
	private String rgEmissor;
	private int cpf;
	private int pis;
	private Date dataContratacao;
	private String email;
	private String complemento;
	private Logradouro logradouro;
	private String login;
	private String senha;
	private byte tipoAdm;
	private Cargo cargo;
	
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Funcionario(int id, String nome, byte resddd, int restel, byte celddd, int celtel, int rg, String rgEmissor,
			int cpf, int pis, Date dataContratacao, String email, String complemento, Logradouro logradouro,
			String login, String senha, byte tipoAdm, Cargo cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.resddd = resddd;
		this.restel = restel;
		this.celddd = celddd;
		this.celtel = celtel;
		this.rg = rg;
		this.rgEmissor = rgEmissor;
		this.cpf = cpf;
		this.pis = pis;
		this.dataContratacao = dataContratacao;
		this.email = email;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.login = login;
		this.senha = senha;
		this.tipoAdm = tipoAdm;
		this.cargo = cargo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public byte getResddd() {
		return resddd;
	}


	public void setResddd(byte resddd) {
		this.resddd = resddd;
	}


	public int getRestel() {
		return restel;
	}


	public void setRestel(int restel) {
		this.restel = restel;
	}


	public byte getCelddd() {
		return celddd;
	}


	public void setCelddd(byte celddd) {
		this.celddd = celddd;
	}


	public int getCeltel() {
		return celtel;
	}


	public void setCeltel(int celtel) {
		this.celtel = celtel;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}


	public String getRgEmissor() {
		return rgEmissor;
	}


	public void setRgEmissor(String rgEmissor) {
		this.rgEmissor = rgEmissor;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getPis() {
		return pis;
	}


	public void setPis(int pis) {
		this.pis = pis;
	}


	public Date getDataContratacao() {
		return dataContratacao;
	}


	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public Logradouro getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public byte getTipoAdm() {
		return tipoAdm;
	}


	public void setTipoAdm(byte tipoAdm) {
		this.tipoAdm = tipoAdm;
	}


	public Cargo getCargo() {
		return cargo;
	}


	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
	
	

}
