package model;

public class ClientePessoaJuridica extends Cliente
{
	
	private int cnpj;
	
	public ClientePessoaJuridica(){
		
	}
	public ClientePessoaJuridica(int cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}

	
