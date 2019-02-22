
package atividadeheranca;


public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(){}
    public Pessoa (String testenome, String testeendereço, String testetelefone){
        this.nome = testenome;
        this.telefone = testetelefone;
        this.endereço = testeendereço;
        
    }

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

  
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

   
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
