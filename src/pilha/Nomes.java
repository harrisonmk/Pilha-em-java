
package pilha;


public class Nomes {
  
   private String nome;

    public Nomes(String nome) {
        this.nome = nome;
    }

   public Nomes (){
       
       
   }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome = " + nome;
    }
    
    
}
