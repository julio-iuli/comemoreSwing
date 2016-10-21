package model;

import java.util.Date;

public class Pedido {
	
	private int id;
	private Date dataPedido;
	private Date dataEntrega;
	private String obsPedido;
	private String complemento;
	private Logradouro logradouro;
	private Cliente cliente;
	private Funcionario funcionario;
	
	
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int id, Date dataPedido, Date dataEntrega, String obsPedido, String complemento,
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

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
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
