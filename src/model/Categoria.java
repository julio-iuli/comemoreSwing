package model;

    class Categoria{
        
        private int id;
        private String nome;
        //Associação:A pk de Categoria entra em tema
        protected Tema tema;
        
        //Construtores
        public Categoria(){
            
        }
        public Categoria(int id,String nome){
            this.id = id;
            this.nome = nome;
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
        
        //Printa-dor
        public String toString(printarcategoria){
            return printarcategoria+"Id da Categoria: "+this.id+
                                    "Categoria do Tema: "+this.nome;    
        }
        
    }