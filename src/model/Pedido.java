package model;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Pedido {
	
	private int id;
	private LocalDate dataPedido;
	private Timestamp dataEntrega;
	private String obsPedido;
	private String complemento;
	private Logradouro logradouro;
	private Cliente cliente;
	private Funcionario funcionario;
	private Tema tema;
	
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int id, LocalDate dataPedido, Timestamp dataEntrega, String obsPedido, String complemento,
			Logradouro logradouro, Cliente cliente, Funcionario funcionario) {
		super();
		this.id = id;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.obsPedido = obsPedido;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.cliente = cliente;
		this.funcionario = funcionario;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Timestamp getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Timestamp dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getObsPedido() {
		return obsPedido;
	}

	public void setObsPedido(String obsPedido) {
		this.obsPedido = obsPedido;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
