
package atividadepolimorfismo;

public class Funcionario {

     String nome;
     float salarioL;
    
    public Funcionario(){}
    public Funcionario (String testenome, Float testesalarioL){
        this.nome = testenome;
        this.salarioL = testesalarioL;
        
 
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public float getSalarioL() {
        return salarioL;
    }

   
    public void setSalarioL(float salarioL) {
        this.salarioL = salarioL;
    }
    public void getSalarioBruto(){
            
            this.salarioL = this.salarioL*1;
            
    }
    public void getInfor(){
        
        System.out.println(this.nome);
        System.out.println(this.salarioL);
    }
   
    
    
     static void add(Funcionario Teste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
