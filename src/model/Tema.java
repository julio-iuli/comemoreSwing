package model;

class Tema extends Categoria{
    
    private int id;
    private String nome, descricao, status, dataCompra, imgTema;//observar porque pode ser outra classe.
    private char genero;
    private double preco;
    //Associação com outra tabela
    protected Categoria categoria;

    public Tema(){
    }    
    public Tema (	int id, 
    				String nome, 
    				String descricao, 
    				String status, 
    				String dataCompra, 
    				String imgTema,
    				char genero,
    				double preco){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataCompra = dataCompra;
        this.imgTema = imgTema;
        this.genero = genero;
        this.preco = preco;
    }
    
    //gets e sets
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setdataCompra(String dataCompra){
        this.dataCompra = dataCompra;
    }
    public String getdataCompra(){
        return dataCompra;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public char getGenero(){
        return genero;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setImgTema(String imgTema){
        this.imgTema = imgTema;
    }
    public String getImgTema(){
        return this.imgTema;
    }
    
    //Printar o atributos
    public String toString(){
        return "Id Tema: " + this.id +
                  "Nome do Tema: " + this.nome +
                  "Descrição do Tema: "+ this.descricao +
                  "Status do Tema: "+this.status+
                  "Gênero do Tema: "+this.genero+
                  "Data de Compra/Tema: "+this.dataCompra+
                  "Preço do Tema: "+this.preco;
        
        
    }
    
    
    
    
    
}