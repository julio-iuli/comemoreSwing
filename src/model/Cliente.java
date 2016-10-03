package model;

import java.util.Date;

public class Cliente{
	
	
	private int id;
	private String nome;
	private byte resddd;
	private int restel;
	private byte celddd;
	private int celtel;
	private int rg;
	private String rgEmissor;
	private int cpf;
	private int cnpj;
	private byte pfpj;
	private String email;
	private Date dataNasc;
	private String complemento;
	private Logradouro logradouro;
	private String recomendacaoNome;
	private Date recomendacaoDataNasc;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(int id, String nome, byte resddd, int restel, byte celddd, int celtel, int rg, String rgEmissor,
			int cpf, int cnpj, byte pfpj, String email, Date dataNasc, String complemento, Logradouro logradouro,
			String recomendacaoNome, Date recomendacaoDataNasc) {
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
		this.cnpj = cnpj;
		this.pfpj = pfpj;
		this.email = email;
		this.dataNasc = dataNasc;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.recomendacaoNome = recomendacaoNome;
		this.recomendacaoDataNasc = recomendacaoDataNasc;
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


	public int getCnpj() {
		return cnpj;
	}


	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}


	public byte getPfpj() {
		return pfpj;
	}


	public void setPfpj(byte pfpj) {
		this.pfpj = pfpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
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


	public String getRecomendacaoNome() {
		return recomendacaoNome;
	}


	public void setRecomendacaoNome(String recomendacaoNome) {
		this.recomendacaoNome = recomendacaoNome;
	}


	public Date getRecomendacaoDataNasc() {
		return recomendacaoDataNasc;
	}


	public void setRecomendacaoDataNasc(Date recomendacaoDataNasc) {
		this.recomendacaoDataNasc = recomendacaoDataNasc;
	}
	
	
	
	
	
	
	
	
	
	
	

}
