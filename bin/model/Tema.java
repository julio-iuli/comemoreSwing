//Mudar o nome da extensão depois,fiz assim porque estou usando o cloud9 

package model;

class Tema{
    
    private int id;
    private String nome,status,descricao,dataCompra;//data também atenção aqui
    private char genero;
    private double preco;
    private String imagem;//Atenção aqui pois pode ser outra coisa inclusive uma nova classe
    protected Categoria categoria;//pega uma fk de categoria
    
    
    //pensar no banco e na maneira que iremos chamar os construtores
    Categoria(){
    }
    Categoria(int id,String nome status descricao dataCompra imagem,char genero,double preco,){
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.descricao = descricao;
        this.dataCompra = dataCompra;
        this.genero = genero;
        this.imagem = imagem;
        this.preco = preco;
    }
    
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
        return status;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDataCompra(String dataCompra){
        this.dataCompra = dataCompra;
    }    
    public String getDataCompra(){
        return dataCompra;
    }
    public void setImagen(String imagem){
        this.imagem = imagem;
    }    
    public String getImagem(){
        return imagem;
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
    public String getPreco(){
        return preco;
    }
    
    public String toString(Tema){
        return Tema+"id Tema: "+this.tema+
                    "Nome do Tema: "+this.nome+
                    "Status do Tema: "+this.status+
                    "Descrição do Tema: "+this.descricao+
                    "Data da Compra do Tema: "+this.dataCompra+
                    "Gênero do Tema: "+this.genero+
                    "Preço do Tema: "+this.preco;
    }
    
    
    
    
    
    
}