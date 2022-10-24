package POO.Prova_POO.QUESTAO_01;


public class Produto {
     private static int count = 1;
     private int id;
     private String nome;
     private Double preco;

     public Produto(String nome, double preco) {
        this.id = count;
        this.nome = nome;
        this.preco = preco;
        Produto.count += 1;

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

     public double getPreco() {
    	 return preco;
     }
     public void setPreco(double preco) {
    	 this.preco = preco;
     }

     @Override
     public String toString() {
         return "[ID: " + this.getId() +  "\nNome:" + this.getNome() + "\nPreço:" + Value.doubleToString(this.getPreco());
     }
}