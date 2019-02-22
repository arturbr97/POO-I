
package atividadeextra;


public class Cliente {
    private String Cpf;
    private String Nome;
    public Cliente(){}
    public Cliente(String testeCpf , String testeNome){
        this.Cpf = testeCpf;
        this.Nome = testeNome;
        
    }
      public String getCpf(){
        return this.Cpf;
    }
    public String getNome(){
        return this.Nome;
    }
    public void setCpf(String testeCpf){
        this.Cpf = testeCpf;
    }
    public void setNome(String testeNome){
        this.Nome = testeNome;
    }
    
    
}
