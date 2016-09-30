package model;
/* Diego - Eu julgo que deveria ser acresido a essa classe o atributo preco que 
esquecemos,porque o preço de item é do item e não do tema.
*/

    class Item extends Tema{
        
        private int id;
        private String nome;
        private double preco;
        
        //construtores
        public Tema(){
        }
        public Tema(int id,String nome,double preco){
            this.id = id;
            this.nome = nome;
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
        public void setPreco(double preco){
            this.preco = preco;
        }
        public String getPreco(){
            return preco;
        }
        
        //Printa-dor
        public String toString(printaritem){
            return printaritem+"Id do Item: "+this.item+
                                "Nome do item: "+this.nome+
                                "Preço do Item: "+this.preco;
        }
        
        
        
    }