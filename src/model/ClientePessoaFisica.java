package model;

public class ClientePessoaFisica extends Cliente {

	
	private int cpf;
	
	public ClientePessoaFisica(){
		
	}
	public ClientePessoaFisica(int cpf) {
		super();
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
}
